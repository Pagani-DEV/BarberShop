package com.paganidev.barbershop.repositories;

import com.paganidev.barbershop.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
