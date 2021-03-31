package ru.site.dictionary.rest.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.site.dictionary.rest.api.onetoone.*;
import ru.site.dictionary.rest.api.repository.*;

@SpringBootApplication
public class Start implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

    @Autowired
    UsersRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

    	Users anna = new Users("Anna");
    	Users olesya = new Users("Olesya");
    	Users alex = new Users("Alex");

        Address addressAnna = new Address("Khabarovsk");
        Address addressOlesya = new Address("Moscow");
        Address addressAlex = new Address("Vladivostok");
        
        anna.setAddress(addressAnna);
        olesya.setAddress(addressOlesya);
        alex.setAddress(addressAlex);
        
        List<Users> people = Arrays.asList(anna, olesya, alex);

        userRepository.saveAll(people);

        System.out.println("<<<<<<<<" + userRepository.findAll());
    }
}