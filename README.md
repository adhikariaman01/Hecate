- [ ] Netflix Eureka : Service Registry(class annotated with @EnableDiscoveryClient
) and Service Discovery (class annotated with @EnableEurekaServer
)
- [ ] Netflix Ribbon : Client Side load balancing
	- [ ] For this 2 instance of employee-producer instance are ran
	- [ ] Dependency for ribbon are added in employee-consumer(client) app :
	```xml
		<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon -->
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
		    <version>2.0.1.RELEASE</version>
		</dependency>

	```