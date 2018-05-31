package com.producer.controller;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Value("${config.producer.instance:0}")
    private int instance;

	@GetMapping("/")
	public String Hello(String name){
		return "[" + instance + "]" + "Hello, " + name + " " + LocalDateTime.now();
	}
}
