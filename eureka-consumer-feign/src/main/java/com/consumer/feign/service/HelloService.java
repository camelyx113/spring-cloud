package com.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="eureka-producer")
public interface HelloService {

	@GetMapping("/hello/")
    String hello(@RequestParam(value="name") String name);
}
