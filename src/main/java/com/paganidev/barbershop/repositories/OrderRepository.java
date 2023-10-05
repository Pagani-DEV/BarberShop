package com.paganidev.barbershop.repositories;

import com.paganidev.barbershop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
