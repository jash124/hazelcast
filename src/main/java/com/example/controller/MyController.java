package com.example.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test")
	@Cacheable(value = "MyCache")
	public String getmyString() throws InterruptedException {
		System.out.println("This is inside the method");
		Thread.sleep(9000);
		return "Okay This might work";
	}

}
