package com.poscoict.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HrMailServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrMailServerApplication.class, args);
	}

}
