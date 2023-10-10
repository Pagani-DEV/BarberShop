package com.paganidev.barbershop.config;

import com.paganidev.barbershop.repositories.BarberRepository;
import com.paganidev.barbershop.repositories.BarberWorkRepository;
import com.paganidev.barbershop.repositories.ClientRepository;
import com.paganidev.barbershop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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

    @Override
    public void run(String... args) throws Exception {

        //Instaciar BarberWork

        //Instanciar Barber

        //Instanciar Client

        //Instanciar Order



    }
}
