package com.example.demandems.feign;

import com.example.demandems.dto.PartenaireDto;
import com.example.demandems.dto.StartProcessRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "camunda-service", url = "http://localhost:8881/process" )
public interface ICamundaClient {


    @PostMapping ("/start")
    String startProcess(@RequestBody StartProcessRequest startProcessRequest ) ;

    }
