package com.example.fast.repository;

import com.example.fast.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
