package com.example.fast.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.fast.model.Inventario;
import com.example.fast.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> getInventarios(){
        return inventarioRepository.findAll();
    }

    public Inventario saveInventario(Inventario inventario){
        return inventarioRepository.save(inventario);
    }

    public Inventario getInventario(Long id){
        return inventarioRepository.findById(id).get();
    }

    public Inventario updateInventario(Inventario inventario){
        return inventarioRepository.save(inventario);
    }

    public void deleteInventario(Long id){
        inventarioRepository.deleteById(id);
    }
}
