package com.example.application1;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class Application1Application {


    public static void main(String[] args) {
        SpringApplication.run(Application1Application.class, args);
    }





}
