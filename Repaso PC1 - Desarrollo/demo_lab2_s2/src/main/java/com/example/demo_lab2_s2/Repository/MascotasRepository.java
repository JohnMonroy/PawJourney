package com.example.demo_lab2_s2.Repository;


import com.example.demo_lab2_s2.Domain.Mascotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MascotasRepository extends JpaRepository <Mascotas, Long> {
}
