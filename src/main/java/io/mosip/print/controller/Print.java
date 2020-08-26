package io.mosip.print.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import io.mosip.kernel.websub.api.annotation.PreAuthenticateContentAndVerifyIntent;
import io.mosip.print.model.MOSIPMessage;
import io.mosip.print.service.PrintService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/print")
public class Print {

	//@Value("${mosip.event.secret}")
	  //private String secret;
	
	@Autowired
	PrintService printService;

    @PostMapping(value = "/enqueue",consumes = "application/json")
    @PreAuthenticateContentAndVerifyIntent(secret = "Kslk30SNF2AChs2",callback = "/print/enqueue",topic = "http://mosip.io/print/pdf")
	public void printPost(@RequestBody MOSIPMessage message) {
		System.out.println(message.getTopic());
		//TODO: Validate the MOSIPmessage
		//TODO:Call the print service with the map that we received from MOSIPMessage
		//printService.print()
	}
}
