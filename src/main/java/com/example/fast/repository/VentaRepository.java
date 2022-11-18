package com.example.fast.repository;

import com.example.fast.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
