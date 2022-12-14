package com.example.fast.repository;

import com.example.fast.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
