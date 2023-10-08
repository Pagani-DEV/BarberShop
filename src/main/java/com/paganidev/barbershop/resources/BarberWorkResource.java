package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.BarberWork;
import com.paganidev.barbershop.services.BarberWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
public class BarberWorkResource {

    @Autowired
    private BarberWorkService service;

    @GetMapping
    public ResponseEntity<List<BarberWork>> findAll(){
        List<BarberWork> works = service.findAll();
        return ResponseEntity.ok().body(works);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BarberWork> findById(@PathVariable Long id) {
        BarberWork obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<BarberWork> insert(@RequestBody BarberWork obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<BarberWork> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<BarberWork> update(@PathVariable Long id,@RequestBody BarberWork obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);

    }
}
