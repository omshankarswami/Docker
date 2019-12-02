package com.swami.dev.docker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloResource {
	@GetMapping("/hello")
	public String Hello() 
	{
		return "Hello YouTube";
	}
}
