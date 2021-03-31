package ru.kirillch.springdata.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ru.kirillch.springdata.entity.Dictionary;

import java.util.List;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Integer> {

    List<Dictionary> findByWords(String words);

    @Query("select p from Dictionary p order by word")
    List<Dictionary> findAllOrderedByWords();

}