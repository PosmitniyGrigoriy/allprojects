package ru.kirillch.springdata.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ru.kirillch.springdata.entity.People;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {

    List<People> findByFirstName(String firstName);

    @Query("select p from People p order by firstName")
    List<People> findAllOrderedByFirstName();

}