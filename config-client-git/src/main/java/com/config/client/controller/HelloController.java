package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RefreshScope//刷新配置数据
public class HelloController {

	/**
	 * 此处是从配置服务端返回的json中获取指定参数
	 * {"name":"client-config","profiles":["dev"],"label":null,"version":"93c8cbe498014e6e36afc3af73bf4c09435956b0","state":null,"propertySources":[{"name":"https://github.com/camelyx113/config-repo.git/client-config-dev.properties","source":{"neo.hello":"dev123123"}}]}
	 */
	@Value("${neo.hello:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> hello() {
        return Mono.justOrEmpty(profile);
    }
}
