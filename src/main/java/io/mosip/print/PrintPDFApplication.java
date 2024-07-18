package io.mosip.print;
import io.mosip.print.activemq.ActiveMQListener;
import io.mosip.print.service.impl.CbeffImpl;
import io.mosip.print.spi.CbeffUtil;
import io.mosip.vercred.CredentialsVerifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;


@SpringBootApplication(scanBasePackages = { "io.mosip.print.*", "${mosip.auth.adapter.impl.basepackage}"  }, exclude = { DataSourceAutoConfiguration.class,
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

	@Bean
	public CredentialsVerifier credentialsVerifier() {
		return new CredentialsVerifier();
	}

	@Bean
	public ThreadPoolTaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setPoolSize(5);
		threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
		return threadPoolTaskScheduler;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(PrintPDFApplication.class, args);
		configurableApplicationContext.getBean(ActiveMQListener.class).runQueue();
	}

}
