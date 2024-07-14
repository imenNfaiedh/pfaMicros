package com.example.parametragems.services.imp;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.mapper.IModaliteMapper;
import com.example.parametragems.repository.IModaliteRepository;
import com.example.parametragems.services.IModaliteService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor


public class ModaliteServiceImp implements IModaliteService {

    @Autowired
    private IModaliteRepository modaliteRepository;
    @Autowired
    private IModaliteMapper modaliteMapper;


    @Override
    public List<ModaliteDto> getAllModalite() {
        return null;
    }

    @Override
    public ModaliteDto getByIdModalite(int id) {
        return null;
    }

    @Override
    public ModaliteDto createModalite(Modalite modalite) {
        modalite= modaliteRepository.save(modalite);

        return modaliteMapper.toDto(modalite);
    }

    @Override
    public ModaliteDto updateModalite(Modalite modalite, int id) {
        return null;
    }

    @Override
    public void deleteModalite(int id) {

    }
}
