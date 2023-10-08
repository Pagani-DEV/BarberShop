package com.paganidev.barbershop.services;

import com.paganidev.barbershop.entities.Barber;
import com.paganidev.barbershop.repositories.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarberService {

    @Autowired
    private BarberRepository repository;

    public List<Barber> findAll(){
        return repository.findAll();
    }

    public Barber findById(Long id){
        Optional<Barber> obj = repository.findById(id);
        return obj.get();
    }

    public Barber insert(Barber obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Barber update(Long id, Barber obj){
        Barber barber = repository.getReferenceById(id);
        updateData(barber, obj);
        return repository.save(barber);
    }

    //Método UPDATE
    private void updateData(Barber barber, Barber obj){
        barber.setName(obj.getName());
        barber.setEmail(obj.getEmail());
        barber.setPassword(obj.getPassword());
    }

}
