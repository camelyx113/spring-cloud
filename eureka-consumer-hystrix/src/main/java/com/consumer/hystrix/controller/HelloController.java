package com.consumer.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.hystrix.service.HelloService;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	//@GetMapping("/{name}")
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public String hello(@PathVariable("name")String name){
		return helloService.hello(name+" !");
	}
}
