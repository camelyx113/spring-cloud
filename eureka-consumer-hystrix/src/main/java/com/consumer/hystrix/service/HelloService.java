package com.consumer.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.consumer.hystrix.service.impl.HelloRemoteHystrix;

@FeignClient(name="eureka-producer",fallback=HelloRemoteHystrix.class)
public interface HelloService {

	@GetMapping("/hello/")
    String hello(@RequestParam(value="name") String name);
}
