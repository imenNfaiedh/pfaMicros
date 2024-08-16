package com.example.parametragems.feign;

import com.example.parametragems.dto.PartenaireDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PARAMETRAGEMS", url = "http://localhost:8087")

public interface IParametragemsClient {

    @GetMapping("/partners/{id}")
    PartenaireDto getByIdPartner(@PathVariable("id") int id);


}
