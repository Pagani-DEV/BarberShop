package com.paganidev.barbershop.resources;

import com.paganidev.barbershop.entities.Order;
import com.paganidev.barbershop.entities.enums.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping( value = "/orders")
public class OrderResource {


        @GetMapping
        public ResponseEntity<Order> findAll(){
            Order order = new Order(1L, Instant.parse("2024-06-20T19:53:07Z"), OrderStatus.PAID);
            return ResponseEntity.ok().body(order);
        }

}
