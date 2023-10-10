package com.paganidev.barbershop.repositories;

import com.paganidev.barbershop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
