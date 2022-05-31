package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class CreditMovementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditMovementApplication.class, args);
	}

}
