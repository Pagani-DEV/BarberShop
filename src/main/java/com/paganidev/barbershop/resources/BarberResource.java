package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.Barber;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "barbers")
public class BarberResource {

    @GetMapping
    public ResponseEntity<Barber> findAll() {
        Barber barber = new Barber(1L, "Eduard", "eduar@gmail.com", "123456");
        return ResponseEntity.ok().body(barber);

    }
}
