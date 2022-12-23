package com.fxservice.service;

import com.fxservice.entity.Fxrate;
import com.fxservice.repository.FxrateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FxrateService {

    @Autowired
    private FxrateRepository fxrateRepository;

    public Fxrate create(Fxrate fx){
        return fxrateRepository.save(fx);
    }

    public Fxrate update(Fxrate fx){
        return fxrateRepository.save(fx);
    }
    public List<Fxrate> getAll(){
        return fxrateRepository.findAll();
    }
    public void delete(Fxrate fx){
        fxrateRepository.delete(fx);

    }
}
