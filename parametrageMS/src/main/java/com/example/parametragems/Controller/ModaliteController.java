package com.example.parametragems.Controller;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.services.IModaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/modalite")

public class ModaliteController {


    @Autowired
    private IModaliteService modaliteService;

//    @PostMapping("")
//    public ModaliteDto createModalite(@RequestBody Modalite modalite)
//    {
//        return modaliteService.createModalite(modalite);
//    }


    @GetMapping()
    public ResponseEntity<List<ModaliteDto>> getAllmodalite()
    {
        return ResponseEntity.ok(modaliteService.getAllModalite());
    }

    @GetMapping("{id}")
    public ResponseEntity<ModaliteDto> getByIdModalite(@PathVariable int id)
    {
        return ResponseEntity.ok(modaliteService.getByIdModalite(id));
    }

    @PutMapping("/{id}")
    public  ModaliteDto updateModalite(@PathVariable int id, @RequestBody ModaliteDto modaliteDto)
    {
        modaliteDto.setIdModalite(id);
        return modaliteService.updateModalite(modaliteDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteModalite(@PathVariable int id)
    {
        modaliteService.deleteModalite(id);
    }



    @PostMapping("")
    public ResponseEntity<Modalite> saveOrUpdateModalite(@RequestBody ModaliteDto  modaliteDto) {
        Modalite savedModalite = modaliteService.saveOrUpdateModalite(modaliteDto);
        return new ResponseEntity<>(savedModalite, HttpStatus.OK);
    }


}
