# Spring Boot Microservices Eureka server Example

## Eureka Server
[Spring-Ms-Eureka-Server](Spring-Ms-Eureka-Server) is an example project for Eureka Server

## Client services
[Spring-Ms-Service1](Spring-Ms-Service1) are example services which registers with Eureka server


## Steps followed to create Eureka server
1. Created Springboot app with Spring cloud Eureka server starter
2. Added '@EnableEurekaServer' on application class to enable Eureka server nature on application
3. Updated properties file to avoid self registration and fetch registry

## Steps followed to create Services
1. Created Springboot apps with Spring cloud Eureka Discovery and Spring boot web starters. 
   Web start is optional for POC but if you want to serve endpoints web is required
2. Added '@EnableEurekaClient' on application class to enable Eureka client nature on application
3. Updated properties file to add ureka server url which would be used by services for registration

## How to run the example
1. Clone repository and import all three projects as maven projects
2. Start Spring-Ms-Eureka-Server as Spring Boot application
3. Start Spring-Ms-Service1, Spring-Ms-Service as Spring boot applications
3. Launch http://localhost:8761/ , Eureka dashboard will be displayed with Service1 and Service 2 as registered services

