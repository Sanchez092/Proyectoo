package com.example.fast.service;

import com.example.fast.model.Respuesta;
import com.example.fast.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;

    public List<Respuesta> getRespuestas(){
        return respuestaRepository.findAll();
    }

    public Respuesta saveRespuesta(Respuesta respuesta){
        return respuestaRepository.save(respuesta);
    }

    public Respuesta getRespuesta(Long id){
        return respuestaRepository.findById(id).get();
    }

    public Respuesta updateRespuesta(Respuesta respuesta){
        return respuestaRepository.save(respuesta);
    }

    public void deleteRespuesta(Long id){
        respuestaRepository.deleteById(id);
    }
}
