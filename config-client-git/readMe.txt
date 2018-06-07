1.配置中心-client端
	1.1 bootstrap.properties 中 spring.cloud.config.name为配置文件名称
	1.2 增加主动刷新框架，主动刷新uri只支持post需要额外的工具刷新  执行 curl -X POST http://localhost:13000/actuator/refresh
	
http://localhost:13000/info 返回具体参数
http://localhost:13000/actuator/refresh 属性修改后参数数据