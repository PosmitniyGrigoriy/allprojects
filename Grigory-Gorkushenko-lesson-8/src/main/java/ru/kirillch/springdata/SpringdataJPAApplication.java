package ru.kirillch.springdata;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.kirillch.springdata.entity.Address;
import ru.kirillch.springdata.entity.Dictionary;
import ru.kirillch.springdata.entity.People;
import ru.kirillch.springdata.repository.PeopleRepository;
import ru.kirillch.springdata.repository.DictionaryRepository;

@SpringBootApplication
public class SpringdataJPAApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataJPAApplication.class, args);
    }

    @Autowired
    PeopleRepository peopleRepository;
    
    @Autowired
    DictionaryRepository dictionaryRepository;
    
    @Override
    public void run(String... args) throws Exception {

        People anna = new People("Anna");
        People olesya = new People("Olesya");
        People alex = new People("Alex");

        Address addressAnna = new Address("Khabarovsk");
        Address addressOlesya = new Address("Moscow");
        Address addressAlex = new Address("Vladivostok");
        
        anna.setAddress(addressAnna);
        olesya.setAddress(addressOlesya);
        alex.setAddress(addressAlex);
        
        List<People> people = Arrays.asList(anna, olesya, alex);

        peopleRepository.saveAll(people);
        
        System.out.println("<<<<<<<<" + peopleRepository.findAll());
        
        Dictionary word1 = new Dictionary("Boy", 222, "[bɔɪ]", "Мальчик");
        Dictionary word2 = new Dictionary("Girl", 48, "[gɜːl]", "Девочка");
        Dictionary word3 = new Dictionary("Book", 73, "[bʊk]", "Книга");
        
        List<Dictionary> words = Arrays.asList(word1, word2, word3);

        dictionaryRepository.saveAll(words);

        System.out.println("<<<<<<<<" + dictionaryRepository.findAll());
    }
}