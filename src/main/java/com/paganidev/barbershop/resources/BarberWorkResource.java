package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.BarberWork;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/works")
public class BarberWorkResource {

    @GetMapping
    public ResponseEntity<BarberWork> findAdll(){
        BarberWork barberWork = new BarberWork(1L, "Corte", "Corte a maquina ou tesoura", 60.0, 20);
        return ResponseEntity.ok().body(barberWork);
    }
}
