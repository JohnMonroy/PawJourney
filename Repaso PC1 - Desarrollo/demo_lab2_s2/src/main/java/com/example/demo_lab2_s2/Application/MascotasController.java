package com.example.demo_lab2_s2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mascotas")
public class MascotasController {

    @GetMapping
    public ResponseEntity<String> getApi() {
        return ResponseEntity.ok("Mascotas");
    }

}
