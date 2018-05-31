package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	
//	 @Autowired
//	 private LoadBalancerClient client;
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@GetMapping("/")
//	public String hello(String name){
//		ServiceInstance serviceInstance = client.choose("eureka-producer");
//		String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello/?name=" + name;
//        return restTemplate.getForObject(url, String.class);
//	}
	
	@GetMapping("/")
	public String hello(String name){
		name += "!";
		String url = "http://eureka-producer/hello/?name=" + name;
		//String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
	}
}
