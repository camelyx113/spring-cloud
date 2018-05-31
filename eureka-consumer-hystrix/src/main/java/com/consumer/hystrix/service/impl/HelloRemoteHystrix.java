package com.consumer.hystrix.service.impl;

import org.springframework.stereotype.Component;
import com.consumer.hystrix.service.HelloService;
@Component
public class HelloRemoteHystrix implements HelloService {

	@Override
	public String hello(String name) {
		 return "Hello World!";
	}

}
