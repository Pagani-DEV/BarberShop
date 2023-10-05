package com.paganidev.barbershop.repositories;

import com.paganidev.barbershop.entities.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {
}
