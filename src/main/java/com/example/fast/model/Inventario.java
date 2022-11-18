package com.example.fast.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
@Getter
@Setter
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idinventario", unique = true)
    private Long id;

    @Column(length = 50, nullable = false)
    private String categoria;
    @Column(length = 50, nullable = false)
    private int entradas;
    @Column(length = 50, nullable = false)
    private int salidas;
    @Column(columnDefinition = "text")
    private String descripcion;

}
