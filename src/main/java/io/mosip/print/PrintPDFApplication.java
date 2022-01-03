package io.mosip.print;

import io.mosip.print.util.WebSubSubscriptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import io.mosip.print.service.impl.CbeffImpl;
import io.mosip.print.spi.CbeffUtil;



@SpringBootApplication(scanBasePackages = { "${mosip.auth.adapter.impl.basepackage}" },exclude = { DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,
		CacheAutoConfiguration.class })
@EnableScheduling
@EnableAsync
public class PrintPDFApplication {


	@Bean
	@Primary
	public CbeffUtil getCbeffUtil() {
		return new CbeffImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(PrintPDFApplication.class, args);
	}

}
