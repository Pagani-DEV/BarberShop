package com.paganidev.barbershop.repositories;

import com.paganidev.barbershop.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
