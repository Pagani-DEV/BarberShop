package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.Barber;
import com.paganidev.barbershop.services.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/barbers")
public class BarberResource {

    @Autowired
    private BarberService service;

    @GetMapping
    public ResponseEntity<List<Barber>> findAll() {
        List<Barber> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Barber> findById(@PathVariable Long id){
        Barber obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Barber> insert(@RequestBody Barber obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Barber> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Barber> update(@PathVariable Long id, @RequestBody Barber obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }


}
