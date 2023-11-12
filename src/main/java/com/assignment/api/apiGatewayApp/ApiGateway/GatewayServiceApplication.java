package com.assignment.api.apiGatewayApp.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {

		System.setProperty("spring.config.name", "gatewayservice");
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
