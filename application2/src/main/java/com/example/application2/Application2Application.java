package com.example.application2;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@SpringBootApplication
@RestController
public class Application2Application {




    public static void main(String[] args) {
        SpringApplication.run(Application2Application.class, args);
    }

}
