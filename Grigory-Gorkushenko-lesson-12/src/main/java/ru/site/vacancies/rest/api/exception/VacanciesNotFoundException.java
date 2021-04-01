package ru.site.vacancies.rest.api.exception;

public class VacanciesNotFoundException extends Exception {
   private long vacancies_id;
   
   public VacanciesNotFoundException(long vacanciesId) {
       super(String.format("Vacancies is not found with id : '%s'", vacanciesId));
   }
}