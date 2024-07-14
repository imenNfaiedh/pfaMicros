package com.example.demandems.service.serviceImp;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.entities.Demande;
import com.example.demandems.mapper.IDemandeMapper;
import com.example.demandems.repository.IDemandeRepository;
import com.example.demandems.service.IDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeServiceImpl implements IDemandeService {

    @Autowired
    private IDemandeRepository demandeRepository;
    @Autowired
    private IDemandeMapper demandeMapper;
    @Override
    public List<DemandeDto> getAllDemande() {
        List<Demande> demandes =demandeRepository.findAll();

        return demandeMapper.toDto(demandes)  ;
    }

    @Override
    public DemandeDto getByIdDemande(int id) {
        Optional<Demande> demande= demandeRepository.findById(id);
        if (demande.isPresent())
        {
            return demandeMapper.toDto(demande.get());
        }
        else {
            System.out.println("demande not found");
            return null;
        }

    }

    @Override
    public DemandeDto createDemande(Demande demande) {
        demande= demandeRepository.save(demande);
        return demandeMapper.toDto(demande);
    }

    @Override
    public DemandeDto updateDemande(Demande demande, int id) {
        if ((!demandeRepository.existsById(demande.getIdDemande())))
        {
            throw new RuntimeException("demande not found");
        }
        demande=demandeRepository.save(demande);
        return  demandeMapper.toDto(demande);
    }

    @Override
    public void deleteDemand(int id) {
        demandeRepository.deleteById(id);

    }
}
