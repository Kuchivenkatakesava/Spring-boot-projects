package com.zensar.messageapi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.Entity.Message;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {
	private List<Message> messages;
	
	public MessageRestController() {
		this.messages=new ArrayList<>();
		Message m1=new Message();
		m1.setId(1);
		m1.setMessage("Good Morning");
		
		Message m2=new Message();
		m2.setId(2);
		m2.setMessage("Good Afternoon");
		
		this.messages.add(m1);
		this.messages.add(m2);
		
		
	}
	
	@GetMapping
	public List<Message>findAll() {
		return this.messages;
	}
	
	@PostMapping
	public Message createMessage(@RequestBody Message newMessage) {
		this.messages.add(newMessage);
		return newMessage;
	}

}
