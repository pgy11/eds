package com.hello.mycloud.eds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdsApplication.class, args);
	}

}
