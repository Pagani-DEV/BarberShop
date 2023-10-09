package com.paganidev.barbershop.config;

import com.paganidev.barbershop.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
//CommandLineRunner Serve para rodar esta classe de teste
public class TestConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
