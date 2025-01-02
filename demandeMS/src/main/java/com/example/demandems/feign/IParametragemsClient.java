package com.example.demandems.feign;

import com.example.demandems.dto.ModaliteDto;
import com.example.demandems.dto.PartenaireDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PARAMETRAGEMS", url = "http://localhost:8087" )

public interface IParametragemsClient {



    @GetMapping("/partners/{id}")
    PartenaireDto getByIdPartner(@PathVariable("id") int id);

    @GetMapping("/modalite/{id}")
    ModaliteDto getByIdModalite (@PathVariable("id") int id);


        @GetMapping("/conventions/checkConvention/{idPartenaire}/{idModalite}")
        boolean checkConvention(@PathVariable("idPartenaire") int idPartenaire, @PathVariable("idModalite") int idModalite);







}
