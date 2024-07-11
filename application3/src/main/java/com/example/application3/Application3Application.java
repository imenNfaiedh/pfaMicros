package com.example.application3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Application3Application {

	public static void main(String[] args) {
		SpringApplication.run(Application3Application.class, args);
	}

}
