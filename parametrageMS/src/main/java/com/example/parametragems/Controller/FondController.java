package com.example.parametragems.Controller;

import com.example.parametragems.dto.FondDto;
import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Fond;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.services.IFondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/fonds")
public class FondController {

    @Autowired
    private IFondService fondService;

    @PostMapping("")
    public FondDto createFond(@RequestBody Fond fond)
    {

        return fondService.createFond(fond);
    }
    @GetMapping("")
    public ResponseEntity<List<FondDto>> getAllFond()
    {
        return ResponseEntity.ok(fondService.getAllFond());
    }

    @GetMapping("{id}")
    public ResponseEntity<FondDto> getByIdFond(@PathVariable int id)
    {
        return ResponseEntity.ok(fondService.getByIdFond(id));
    }

    @PutMapping("/{id}")
    public  FondDto updateFond(@PathVariable int id, @RequestBody FondDto fondDto)
    {
        fondDto.setIdFond(id);
        return fondService.updateFond(fondDto,id);
    }

    @DeleteMapping("/{id}")
    public void deleteFond(@PathVariable int id)
    {
        fondService.deleteFond(id);
    }
}
