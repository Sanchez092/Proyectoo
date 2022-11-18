package com.example.fast.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idproveedor", unique = true)
    private Long id;

    @Column(length = 50, nullable = false)
    private int RUT;
    private String primer_nombre;
    @Column(length = 50, nullable = false)
    private String segundo_nombre;
    @Column(length = 50, nullable = false)
    private String primer_apellido;
    @Column(length = 50, nullable = false)
    private String segundo_apellido;
    @Column(length = 10, nullable = false)
    private int telefono;

}
