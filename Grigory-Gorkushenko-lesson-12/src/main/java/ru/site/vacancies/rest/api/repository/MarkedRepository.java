package ru.site.vacancies.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.site.vacancies.rest.api.model.Marked;

@Repository
public interface MarkedRepository extends JpaRepository<Marked, Boolean> {

}