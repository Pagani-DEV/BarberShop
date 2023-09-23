package com.paganidev.barbershop.entities;

import com.paganidev.barbershop.entities.enums.OrderStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant moment;
    private OrderStatus orderStatus;

    public Order(){
    }

    public Order(Long id, Instant moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(moment, order.moment) && orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, moment, orderStatus);
    }
}
