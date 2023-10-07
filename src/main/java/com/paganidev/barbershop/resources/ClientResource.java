package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.Client;
import com.paganidev.barbershop.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ClientService service;

    @GetMapping
    private ResponseEntity<List<Client>> findAll(){
        List<Client> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Client> findById(@PathVariable Long id){
        Client obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    private ResponseEntity<Client> insert(@RequestBody Client obj) {
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Client> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }


}
