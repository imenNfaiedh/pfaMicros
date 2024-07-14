package com.example.demandems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient

public class DemandeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandeMsApplication.class, args);
	}

}
