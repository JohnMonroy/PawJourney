package com.example.demo_lab2_s2.Application;

import com.example.demo_lab2_s2.Domain.Mascotas;
import com.example.demo_lab2_s2.Repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Mascotas")
public class MascotasController {

    @Autowired MascotasRepository mascotasrepository;

    @PostMapping
    public ResponseEntity<Mascotas> crearMascota(@RequestBody Mascotas mascota) {
        Mascotas savedMascota = mascotasrepository.save(mascota);
        return ResponseEntity.ok(savedMascota);
    }

    @GetMapping
    public ResponseEntity<List<Mascotas>> listarMascotas() {
        List<Mascotas> mascotas = mascotasrepository.findAll();
        return ResponseEntity.ok(mascotas);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getApi() {
        return ResponseEntity.ok("Mascotas");
    }





}
