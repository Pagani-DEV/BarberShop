package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    private ResponseEntity<Client> findAll(){
        Client client = new Client(1L, "Guerreiro", "000000");
        return ResponseEntity.ok().body(client);
    }


}
