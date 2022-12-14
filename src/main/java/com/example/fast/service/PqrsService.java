package com.example.fast.service;

import com.example.fast.model.Pqrs;
import com.example.fast.repository.PqrsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PqrsService {

    @Autowired
    private PqrsRepository pqrsRepository;

    public List<Pqrs> getPqrss(){
        return pqrsRepository.findAll();
    }

    public Pqrs savePqrs(Pqrs pqrs){
        return pqrsRepository.save(pqrs);
    }

    public Pqrs getPqrs(Long id){
        return pqrsRepository.findById(id).get();
    }

    public Pqrs updatePqrs(Pqrs pqrs){
        return pqrsRepository.save(pqrs);
    }

    public void deletePqrs(Long id){
        pqrsRepository.deleteById(id);
    }
}
