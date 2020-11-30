package com.bezkoder.spring.data.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootDataDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataDepartmentApplication.class, args);
	}

}
