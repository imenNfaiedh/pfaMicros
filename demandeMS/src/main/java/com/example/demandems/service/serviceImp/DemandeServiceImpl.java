package com.example.demandems.service.serviceImp;

import com.example.demandems.dto.DemandeDto;
import com.example.demandems.dto.ModaliteDto;
import com.example.demandems.dto.PartenaireDto;
import com.example.demandems.dto.StartProcessRequest;
import com.example.demandems.entities.Demande;
import com.example.demandems.exception.NotFoundException;
import com.example.demandems.feign.ICamundaClient;
import com.example.demandems.feign.IParametragemsClient;
import com.example.demandems.mapper.IDemandeMapper;
import com.example.demandems.repository.IDemandeRepository;
import com.example.demandems.service.IDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DemandeServiceImpl implements IDemandeService {



    @Autowired
    private IDemandeRepository demandeRepository;
    @Autowired
    private IDemandeMapper demandeMapper;

    @Autowired
    private IParametragemsClient parametragemsClient;



    @Autowired
    ICamundaClient iCamundaClient;




    //affecter l'ID d un partenaire & modalite a une demande
//    @Override
//    public DemandeDto affecterIdPartenaire(int idDemande, int idPartenaire, int idModalite) {
//        Demande demande = demandeRepository.findById(idDemande)
//                .orElseThrow(() -> new NotFoundException("Demand with ID" +idDemande+ " not exist"));
//
//        // Vérification si le partenaire a une convention dans cette modalité
//        boolean hasConvention = parametragemsClient.checkConvention(idPartenaire, idModalite);
//        if (!hasConvention) {
//            throw new NotFoundException("Partner with ID " + idPartenaire + " does not have a convention in modality " + idModalite);
//        }
//
//        demande.setIdPartenaire(idPartenaire);
//        demande.setIdModalite(idModalite);
//
//        demande = demandeRepository.save(demande);
//        return demandeMapper.toDto(demande);
//    }



    public PartenaireDto getByIdPartner(int id) {
        return parametragemsClient.getByIdPartner(id);
    }

    public ModaliteDto getByIdModalite(int id) {
        return parametragemsClient.getByIdModalite(id);
    }
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
    public DemandeDto createDemande(DemandeDto demandeDto ) {
        boolean hasConvention = parametragemsClient.checkConvention( demandeDto.getIdPartenaire(),  demandeDto.getIdModalite());
        if (!hasConvention) {
            throw new NotFoundException("Partner with ID " + demandeDto.getIdPartenaire() + " does not have a convention in modality " +  demandeDto.getIdModalite());
        }
        Demande demande = new Demande();
        demande.setNameDemande(demandeDto.getNameDemande());
        demande.setIdModalite(demandeDto.getIdModalite());
        demande.setIdPartenaire(demandeDto.getIdPartenaire());

        demande= demandeRepository.save(demande);


        // Appel au microservice Camunda pour démarrer le processus
        StartProcessRequest  request = new StartProcessRequest();
        request.setDemandeId(String.valueOf(demande.getIdDemande()));;
        request.setUserTosend("nfaiedh");
        request.setDateSaisie(new Date().toString());
        iCamundaClient.startProcess(request);


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
