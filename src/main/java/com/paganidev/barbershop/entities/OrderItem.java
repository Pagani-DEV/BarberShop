package com.paganidev.barbershop.entities;

import com.paganidev.barbershop.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
public class OrderItem {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;

    public OrderItem(){
    }

    public OrderItem(Order order, BarberWork barberWork, Integer quantity, Double price) {
        id.setOrder(order);
        id.setBarberWork(barberWork);
        this.quantity = quantity;
        this.price = price;
    }

    //Metodo Get tem que ser feito a mão para pegar os metodos lá do OrderitemPK
    public Order getOrder(){
        return id.getOrder();
    }

    //Metodo Set tem que ser feito a mão para pegar os metodos lá do OrderitemPK
    public void setOrder(Order order) {
        id.setOrder(order);
    }

    //Metodo Get tem que ser feito a mão para pegar os metodos lá do OrderitemPK
    public BarberWork getBarberWork(){
        return id.getBarberWork();
    }

    //Metodo Set tem que ser feito a mão para pegar os metodos lá do OrderitemPK
    public void setBarberWork(BarberWork barberWork){
        id.setBarberWork(barberWork);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSubTotal(){
        return quantity * price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id) && Objects.equals(quantity, orderItem.quantity) && Objects.equals(price, orderItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, price);
    }
}
