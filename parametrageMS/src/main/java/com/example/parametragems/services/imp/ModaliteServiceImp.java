package com.example.parametragems.services.imp;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.mapper.IModaliteMapper;
import com.example.parametragems.repository.IModaliteRepository;
import com.example.parametragems.services.IModaliteService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor


public class ModaliteServiceImp implements IModaliteService {

    @Autowired
    private IModaliteRepository modaliteRepository;
    @Autowired
    private IModaliteMapper modaliteMapper;


    @Override
    public List<ModaliteDto> getAllModalite() {
        List<Modalite> modalites=modaliteRepository.findAll();
        return modaliteMapper.toDto(modalites);
    }

    @Override
    public ModaliteDto getByIdModalite(int id) {
        Optional<Modalite> modalite =modaliteRepository.findById(id);
        if (modalite.isPresent())
        {
            return modaliteMapper.toDto(modalite.get());
        }
        else
        {
            System.out.println("Modalite not found ");
            return null;
        }

    }

    @Override
    public ModaliteDto createModalite(Modalite modalite) {
        modalite= modaliteRepository.save(modalite);

        return modaliteMapper.toDto(modalite);
    }

    @Override
    public ModaliteDto updateModalite(Modalite modalite, int id) {
        if (!modaliteRepository.existsById(modalite.getIdModalite()))
        {
            throw new RuntimeException("Modalite not found");

        }
        modalite=modaliteRepository.save(modalite);
        return modaliteMapper.toDto(modalite);

    }



    @Override
    public void deleteModalite(int id) {
        modaliteRepository.deleteById(id);

    }
}
