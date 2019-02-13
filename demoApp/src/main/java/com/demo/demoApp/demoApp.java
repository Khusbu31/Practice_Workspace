package com.demo.demoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoApp {

	@RequestMapping("/first")
	@GetMapping
	public String returnValue() {
		return "Hello Everyone !";
	
	}
	
	@RequestMapping("/hello")
	@GetMapping
	public String returnHello() {
		return "Hey Buddy !";
	
	}
	
	//Hey this is my second commit
	
}
