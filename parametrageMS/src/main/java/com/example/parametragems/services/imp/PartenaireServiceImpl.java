package com.example.parametragems.services.imp;

import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Convention;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.mapper.IPartenaireMapper;
import com.example.parametragems.repository.IConventionRepository;
import com.example.parametragems.repository.IModaliteRepository;
import com.example.parametragems.repository.IPartenaireRepository;
import com.example.parametragems.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireServiceImpl implements IPartenaireService {



    @Autowired
    private IPartenaireRepository partenaireRepository;
    @Autowired
    private IPartenaireMapper partenaireMapper;
    @Override
    public List<PartenaireDto> getAllPartner() {
        return null;
    }

    @Override
    public PartenaireDto getByIdPartner(int id) {
        return null;
    }

    @Override
    public PartenaireDto createPartner(Partenaire partenaire) {
        partenaire = partenaireRepository.save(partenaire);

        return partenaireMapper.toDto(partenaire);
    }

    @Override
    public PartenaireDto updatePartner(Partenaire partenaire, int id) {
        return null;
    }

    @Override
    public void deletePartner(int id) {

    }
}
