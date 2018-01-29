package com.microservices.secondmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SecondMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroServiceApplication.class, args);
	}
}
