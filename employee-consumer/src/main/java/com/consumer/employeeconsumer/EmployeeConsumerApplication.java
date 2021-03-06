package com.consumer.employeeconsumer;

import com.consumer.employeeconsumer.controller.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@SpringBootApplication
@EnableFeignClients
public class EmployeeConsumerApplication {

    public static void main(String[] args)throws RestClientException,IOException {
        ApplicationContext ctx = SpringApplication.run(
                EmployeeConsumerApplication.class, args);

        ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
        System.out.println(consumerControllerClient);
//        for(int i=0;i<100;i++)
        consumerControllerClient.getEmployee();
    }

    @Bean
    public  ConsumerControllerClient  consumerControllerClient() {
        return  new ConsumerControllerClient();
    }
}
