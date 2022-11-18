package com.example.fast.service;

import com.example.fast.model.Proveedor;
import com.example.fast.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> getProveedores(){
        return proveedorRepository.findAll();
    }

    public Proveedor saveProveedor(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    public Proveedor getProveedor(Long id){
        return proveedorRepository.findById(id).get();
    }

    public Proveedor updateProveedor(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedor(Long id){
        proveedorRepository.deleteById(id);
    }

}
