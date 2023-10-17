package com.paganidev.barbershop.config;

import com.paganidev.barbershop.entities.*;
import com.paganidev.barbershop.entities.enums.OrderStatus;
import com.paganidev.barbershop.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
//CommandLineRunner Serve para rodar esta classe de teste
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BarberRepository barberRepository;

    @Autowired
    private BarberWorkRepository barberWorkRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        //Instaciar BarberWork
        BarberWork bw1 = new BarberWork(null, "Maquina", "Corte á maquina e acabamento na navalha.", 40.0, 15);
        BarberWork bw2 = new BarberWork(null, "Tesoura", "Corte á tesoura e acabamento na navalha.", 80.0, 30);
        BarberWork bw3 = new BarberWork(null, "Economico", "Corte á maquina mas sem acabamento a navalha.", 30.0, 30);

        //Instanciar Barber
        Barber b1 = new Barber(null, "Luciano Hulk Silva", "luciano@gmail.com", "153351");
        Barber b2 = new Barber(null, "Josue Silveira", "josue@gmail.com", "258741");
        Barber b3 = new Barber(null, "Raul Silva", "raul@gmail.com", "987456");

        //Instanciar Client
        Client c1 = new Client(null, "Joao Mineiro", "51 000 000 000");
        Client c2 = new Client(null, "Zé Alfredo", "21 000 000 000");
        Client c3 = new Client(null, "Joao Mineiro", "68 000 000 000");

        barberWorkRepository.saveAll(Arrays.asList(bw1, bw2, bw3));
        barberRepository.saveAll(Arrays.asList(b1, b2, b3));
        clientRepository.saveAll((Arrays.asList(c1, c2, c3)));

        //Instanciar Order  REVER CÓDIGO
        Order o1 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, c1, b1);
        Order o2 = new Order(null, Instant.now(), OrderStatus.CANCELED, c2, b2);
        Order o3 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, c3, b3);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        //Instanciar OrderItem
        OrderItem orderItem1 = new OrderItem(o1, bw1, 3, bw1.getPrice());
        OrderItem orderItem2 = new OrderItem(o2, bw2, 2, bw1.getPrice());
        OrderItem orderItem3 = new OrderItem(o3, bw3, 2, bw1.getPrice());

        orderItemRepository.saveAll(Arrays.asList(orderItem1, orderItem2, orderItem3));

    }
}
