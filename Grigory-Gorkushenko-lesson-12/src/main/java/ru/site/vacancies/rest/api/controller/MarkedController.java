package ru.site.vacancies.rest.api.controller;

import ru.site.vacancies.rest.api.repository.MarkedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MarkedController {

   @Autowired
   MarkedRepository markedRepository;
   
   @GetMapping("/vacancies/marked")
   public List getAllVacanciesMarked() {
       return markedRepository.findAll();
   }
   
}