package com.example.demandems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemandeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandeMsApplication.class, args);
	}

}
