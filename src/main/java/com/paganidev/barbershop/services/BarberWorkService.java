package com.paganidev.barbershop.services;

import com.paganidev.barbershop.entities.BarberWork;
import com.paganidev.barbershop.repositories.BarberWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarberWorkService {

    @Autowired
    private BarberWorkRepository repository;

    public List<BarberWork> findAll(){
        return repository.findAll();
    }

    public BarberWork findById(Long id){
        Optional<BarberWork> obj = repository.findById(id);
        return obj.get();
    }

    public BarberWork insert(BarberWork obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public BarberWork update(Long id, BarberWork obj) {
        BarberWork barberWork = repository.getReferenceById(id);
        updateData(barberWork, obj);
        return repository.save(barberWork);
    }

    //Método UPDATE
    private void updateData(BarberWork barberWork, BarberWork obj) {
        barberWork.setName(obj.getName());
        barberWork.setDescription(obj.getDescription());
        barberWork.setPrice(obj.getPrice());
        barberWork.setDuration(obj.getDuration());
    }



}
