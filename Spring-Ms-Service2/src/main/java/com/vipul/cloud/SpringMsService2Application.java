package com.vipul.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMsService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsService2Application.class, args);
	}
}
