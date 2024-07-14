package com.example.demandems.controller;

import com.example.demandems.dto.CreditDto;
import com.example.demandems.entities.Credit;
import com.example.demandems.service.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credits")
public class CreditController {

    @Autowired
    private ICreditService creditService;

    @PostMapping("/")
    public  CreditDto createCredit (@RequestBody Credit credit)
    {
        return creditService.createCredit(credit);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreditDto> getByIdCredit(@PathVariable int id)
    {
        return ResponseEntity.ok(creditService.getByIdCredit(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<CreditDto>> getAllCredit()
    {
      return ResponseEntity.ok(creditService.getAllCredit());
    }

    @PutMapping("/{id}")
    public  CreditDto updateCredit(@PathVariable int id, @RequestBody Credit credit)
    {
        credit.setIdCredit(id);
        return creditService.updateCredit(credit,id);
    }

    @DeleteMapping("/{id}")
    public void deleteCredit(@PathVariable int id)
    {
        creditService.deleteCredit(id);
    }

}
