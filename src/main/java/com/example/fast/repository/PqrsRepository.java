package com.example.fast.repository;

import com.example.fast.model.Pqrs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PqrsRepository  extends JpaRepository<Pqrs, Long> {
}
