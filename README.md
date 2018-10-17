- [ ] Netflix Eureka : Service Registry(class annotated with ``` @EnableDiscoveryClient```
) and Service Discovery (class annotated with ```@EnableEurekaServer```
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
	- [ ] **Fallback Method** : consumer access producer method, iff there is an error then only fallback method is called.
		- [ ] Hystrix dependency are added in *employer-producer* also ```@EnableCircuitBreaker ``` are added in main app of employer-producer
		:
		```xml
			<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon -->
			<dependency>
			    <groupId>org.springframework.cloud</groupId>
			    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
			    <version>2.0.1.RELEASE</version>
			</dependency>

		```
		- [ ] ```Fallback ``` method is added in EmployeeController.java and annotation ```java @HystrixCommand ``` is also added which has a parameter of the method name(```fallbackmethod ```) which gets called when there is an error in endpoint method.
	- [ ] **Circuit Breaker** : If exception keeps on happening on calling method of producer then circuit of that method breaks and request directly goes to fallback method.

- [ ] Feign : 
	- [ ] consumer app now include feign dependency
	```xml
		<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign -->
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-openfeign</artifactId>
		    <version>2.0.1.RELEASE</version>
		</dependency>

	```
	- [ ] Feign client is created. 
