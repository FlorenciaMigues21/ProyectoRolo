package com.example.proyecto;

import com.example.proyecto.model.User;
import com.example.proyecto.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoApplication.class, args);
    }

    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
    }
}
