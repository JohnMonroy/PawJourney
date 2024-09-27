package com.example.demo_lab2_s2.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class lista_anim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String anim;
    private String desc;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "mascotas_id")
    private Mascotas mascotas;

    
}
