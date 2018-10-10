package com.vipul.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// This enable application to act as eureka server
@EnableEurekaServer
public class SpringMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsEurekaServerApplication.class, args);
	}
}
