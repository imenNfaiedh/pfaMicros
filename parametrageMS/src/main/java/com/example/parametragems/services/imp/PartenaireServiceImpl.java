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
import java.util.Optional;

@Service
public class PartenaireServiceImpl implements IPartenaireService {



    @Autowired
    private IPartenaireRepository partenaireRepository;
    @Autowired
    private IPartenaireMapper partenaireMapper;
    @Override
    public List<PartenaireDto> getAllPartner() {
        List<Partenaire> partenaires =partenaireRepository.findAll();
        return partenaireMapper.toDto(partenaires);
    }

    @Override
    public PartenaireDto getByIdPartner(int id) {
        Optional<Partenaire>partenaire=partenaireRepository.findById(id);
        if(partenaire.isPresent())
        {
            return partenaireMapper.toDto(partenaire.get());

        }
        else {
            System.out.println("Partenaire not found");
            return null;
        }
    }

    @Override
    public PartenaireDto createPartner(Partenaire partenaire) {
        partenaire = partenaireRepository.save(partenaire);

        return partenaireMapper.toDto(partenaire);
    }

    @Override
    public PartenaireDto updatePartner(Partenaire partenaire, int id) {
       if (!partenaireRepository.existsById(partenaire.getIdPartenaire()))
       {
           throw new RuntimeException("Partenaire not found");
       }
       partenaire=partenaireRepository.save(partenaire);
       return partenaireMapper.toDto(partenaire);
    }

    @Override
    public void deletePartner(int id) {
        partenaireRepository.deleteById(id);

    }
}
