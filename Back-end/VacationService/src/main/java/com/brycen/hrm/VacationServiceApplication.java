package com.brycen.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VacationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationServiceApplication.class, args);
	}

}
