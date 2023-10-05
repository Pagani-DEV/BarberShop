package com.paganidev.barbershop.entities.pk;

import com.paganidev.barbershop.entities.BarberWork;
import com.paganidev.barbershop.entities.Order;

import java.io.Serializable;
import java.util.Objects;

public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    private Order order;

    private BarberWork barberWork;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BarberWork getBarberWork() {
        return barberWork;
    }

    public void setBarberWork(BarberWork barberWork) {
        this.barberWork = barberWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(barberWork, that.barberWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, barberWork);
    }
}
