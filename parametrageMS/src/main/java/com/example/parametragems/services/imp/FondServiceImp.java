package com.example.parametragems.services.imp;

import com.example.parametragems.dto.FondDto;
import com.example.parametragems.entities.Fond;
import com.example.parametragems.mapper.IFondMapper;
import com.example.parametragems.repository.IFondRepository;
import com.example.parametragems.services.IFondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FondServiceImp implements IFondService {

    @Autowired
    private IFondRepository fondRepository;
    @Autowired
    private IFondMapper fondMapper;
    @Override
    public List<FondDto> getAllFond() {
        List<Fond> fonds=fondRepository.findAll();
        return fondMapper.toDto(fonds);

    }

    @Override
    public FondDto getByIdFond(int id) {
        Optional<Fond>fond =fondRepository.findById(id);
        if ((fond.isPresent()))
        {
            return fondMapper.toDto(fond.get());
        }
        else {
            System.out.println("fond not found");
            return null;
        }

    }

    @Override
    public FondDto createFond(Fond fond) {
        fond=fondRepository.save(fond);
        return fondMapper.toDto(fond);
    }

    @Override
    public FondDto updateFond(Fond fond, int id) {
        if (!fondRepository.existsById(fond.getIdFond()))
        {
            throw new RuntimeException("Fond not found");

        }
        fond = fondRepository.save(fond);
        return fondMapper.toDto(fond);

    }

    @Override
    public void deleteFond(int id) {
        fondRepository.deleteById(id);

    }
}
