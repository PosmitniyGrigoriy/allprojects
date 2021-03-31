package ru.kirillch.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.kirillch.springdata.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
