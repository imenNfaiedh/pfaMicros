package com.example.parametragems.Controller;

import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partners")

public class PartenaireController {

    @Autowired
    private IPartenaireService partenaireService;

//    @GetMapping("/check/{idPartenaire}/{idModalite}")
//    public ResponseEntity<Boolean> checkConvention(
//            @PathVariable int idPartenaire, @PathVariable int idModalite) {
//        boolean exists = partenaireService.checkConvention(idPartenaire, idModalite);
//        return ResponseEntity.ok(exists);
//    }


    @PostMapping()
    public PartenaireDto createPartner(@RequestBody Partenaire partenaire)
    {
        return partenaireService.createPartner(partenaire);
    }

    @GetMapping("")
    public ResponseEntity<List<PartenaireDto>> getAllPartner()
    {
        return ResponseEntity.ok(partenaireService.getAllPartner());
    }

    @GetMapping("{id}")
    public ResponseEntity<PartenaireDto> getByIdPartner(@PathVariable int id)
    {
        return ResponseEntity.ok(partenaireService.getByIdPartner(id));
    }

    @PutMapping("/{id}")
    public  PartenaireDto updatePartner(@PathVariable int id, @RequestBody PartenaireDto partenaireDto)
    {
        partenaireDto.setIdPartenaire(id);
        return partenaireService.updatePartner(partenaireDto,id);
    }

    @DeleteMapping("/{id}")
    public void deletePartner(@PathVariable int id)
    {
        partenaireService.deletePartner(id);
    }

}
