package com.example.parametragems.Controller;

import com.example.parametragems.dto.ConventionDto;
import com.example.parametragems.dto.ConventionGetDto;
import com.example.parametragems.dto.ConventionRequest;
import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Convention;
import com.example.parametragems.services.IConventionService;
import com.example.parametragems.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/conventions")

public class ConventionController {

    @Autowired
    private IConventionService conventionService;

   @GetMapping("/checkConvention/{idPartenaire}/{idModalite}")
   public ResponseEntity<Boolean> checkConvention(
           @PathVariable int idPartenaire, @PathVariable int idModalite) {
       boolean exists = conventionService.checkConvention(idPartenaire, idModalite);
       return ResponseEntity.ok(exists);}



    @GetMapping("/get")
    public String home() {
        return "<h2>Microservice parametrage is running is running</h2>";
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ConventionGetDto>> getConventionsByPartenaireId(@PathVariable int id) {
        List<ConventionGetDto> conventions = conventionService.getConventionsByPartenaireId(id);
        if (conventions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(conventions);
    }


    @PostMapping()
    public void createConvention(@RequestBody ConventionRequest request)
    {
         conventionService.createConvention(request.getPartenaireId(), request.getModaliteId(),  request.getSigantureDate());
    }
}

