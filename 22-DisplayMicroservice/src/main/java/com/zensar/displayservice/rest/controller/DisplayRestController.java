package com.zensar.displayservice.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.displayservice.feign.client.MessageFeignClient;

@RestController
public class DisplayRestController {
	@Autowired
	private MessageFeignClient feignClient;
	
	@GetMapping("/api/display")
	public String printMessage()
	{
		//This method to talk to messageMicroservice(Seperate Application) and get the message;
		//RestTemplate-can be used but it is better to use spring cloud APIs as below
		return feignClient.callGenerateMessage();
	}

}
