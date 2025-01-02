package com.example.parametragems.services.imp;

import com.example.parametragems.dto.ModaliteDto;
import com.example.parametragems.dto.PartenaireDto;
import com.example.parametragems.entities.Fond;
import com.example.parametragems.entities.Modalite;
import com.example.parametragems.entities.Partenaire;
import com.example.parametragems.mapper.IModaliteMapper;
import com.example.parametragems.repository.IFondRepository;
import com.example.parametragems.repository.IModaliteRepository;
import com.example.parametragems.services.IFondService;
import com.example.parametragems.services.IModaliteService;
import jakarta.ws.rs.NotFoundException;
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
    private IFondRepository fondRepository;
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
    public ModaliteDto updateModalite(ModaliteDto modaliteDto, int id) {
       // Modalite modalite = modaliteMapper.toEntity(modaliteDto);
        Fond fond = fondRepository.findById(modaliteDto.getFondId()).orElseThrow(
                ()-> new NotFoundException("fond not found with id :" + modaliteDto.getFondId())
        );
       Optional< Modalite> modaliteOptional = modaliteRepository.findById(id);
       if(!modaliteOptional.isPresent()){
           throw  new NotFoundException("not found");
       }
        Modalite modalite1 = modaliteOptional.get();
        modalite1.setNomCompletModalite(modaliteDto.getNomCompletModalite());
        modalite1.setMontantMax(modaliteDto.getMontantMax());
        modalite1.setMontantMin(modaliteDto.getMontantMin());
        modalite1.setTypeModalite(modaliteDto.getTypeModalite());
        //modalite1.setNomCompletModalite(modaliteDto.getNomCompletModalite());

        modalite1.setFond(fond);




        //   modalite1.set
        return modaliteMapper.toDto( modaliteRepository.save(modalite1));

    }

    public Modalite saveOrUpdateModalite(ModaliteDto  modaliteDto) {
        Modalite modalite = modaliteMapper.toEntity(modaliteDto);
        Fond fond = fondRepository.findById(modaliteDto.getFondId()).orElseThrow(
                ()-> new NotFoundException("fond not found with id :" + modaliteDto.getFondId())
        );
        //affect
        modalite.setFond(fond);
        // Création d'une nouvelle entité
        return modaliteRepository.save(modalite);
    }



    @Override
    public void deleteModalite(int id) {
        modaliteRepository.deleteById(id);

    }






}
