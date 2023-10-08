package com.paganidev.barbershop.services;

import com.paganidev.barbershop.entities.Client;
import com.paganidev.barbershop.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
        return repository.findAll();
    }

    //Falta fazer tratamento de exceção
    public Client findById(Long id){
        Optional<Client> obj = repository.findById(id);
        return obj.get();
    }

    public Client insert(Client obj){
        return repository.save(obj);
    }

    //Falta Fazer tratamento de exceção
    public void delete(Long id){
        repository.deleteById(id);
    }

    public Client update(Long id, Client obj){
        Client client = repository.getReferenceById(id);
        updateData(client, obj);
        return repository.save(client);
    }

    //Método de Update
    private void updateData(Client client, Client obj){
        client.setName(obj.getName());
        client.setPhone(obj.getPhone());
    }

}
