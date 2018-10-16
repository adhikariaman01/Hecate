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
- [ ] Netflix Hystrix : Fault Tolerence
	- [ ] Hystrix dependency are added in *employer-producer* also ```java @EnableCircuitBreaker ``` are added in main app of employer-producer
	:
	```xml
		<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon -->
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
		    <version>2.0.1.RELEASE</version>
		</dependency>

	```
	- [ ] ```java Fallback ``` method is added in EmployeeController.java and annotation ```java @HystrixCommand ``` is also added which has a parameter of the method name(```java fallbackmethod ```) which gets called when there is an error in endpoint method.
