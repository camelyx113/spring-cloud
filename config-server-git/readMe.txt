1.配置中心-server端
	1.1 读取本地配置文件
		spring.cloud.config.server.git.search-paths=classpath:/config
		spring.profiles.active=native  启用本地配置文件
	1.2 读取github配置文件
		spring.cloud.config.server.git.uri=https://github.com/camelyx113/config-repo.git (注：此种配置路径只能在linux上运行成功,window上运行数组越界错误,错误源码spec = spec.substring(0, spec.lastIndexOf(File.separator)))
		spring.cloud.config.label=master
		spring.cloud.config.server.git.search-paths=config-repo
		spring.cloud.config.server.git.username=camelyx113
		spring.cloud.config.server.git.password=yin123q1
		
2.增加配置服务高可用，配置服务也要注册到注册中心,增加配置
eureka.client.service-url.defaultZone=http://localhost:7000/eureka/		
	
