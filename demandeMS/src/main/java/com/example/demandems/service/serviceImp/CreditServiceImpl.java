package com.example.demandems.service.serviceImp;

import com.example.demandems.dto.CreditDto;
import com.example.demandems.entities.Credit;
import com.example.demandems.mapper.ICreditMapper;
import com.example.demandems.repository.ICreditRepository;
import com.example.demandems.service.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl  implements ICreditService {

    @Autowired
    private ICreditRepository creditRepository;
    @Autowired
    private ICreditMapper creditMapper;
    @Override
    public List<CreditDto> getAllCredit() {
        List<Credit> credits = creditRepository.findAll();
        return creditMapper.toDto(credits);
    }

    @Override
    public CreditDto getByIdCredit(int id) {
        Optional<Credit> credit=creditRepository.findById(id);
        if(credit.isPresent())
        {
            return creditMapper.toDto(credit.get());
        }
        else {
            System.out.println("Credit not found");
            return null;
        }
    }

    @Override
    public  CreditDto createCredit(Credit credit) {
         credit = creditRepository.save(credit);
         return  creditMapper.toDto(credit);
    }

    @Override
    public CreditDto updateCredit(Credit credit, int id) {
        if(!creditRepository.existsById(credit.getIdCredit()))
        {
            throw new RuntimeException("Credit not  found");
        }
        credit=creditRepository.save(credit);
        return creditMapper.toDto(credit);
    }



    @Override
    public void deleteCredit(int id) {
        creditRepository.deleteById(id);

    }
}
