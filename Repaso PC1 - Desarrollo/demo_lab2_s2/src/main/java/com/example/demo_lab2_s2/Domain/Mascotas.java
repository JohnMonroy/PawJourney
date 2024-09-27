package com.example.demo_lab2_s2.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity  /*Base de datos*/
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String nombre;

    @Column
    private LocalDate fecha_nacimiento;

    @OneToMany(mappedBy = "mascotas", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<lista_anim> listaAnims;
}
