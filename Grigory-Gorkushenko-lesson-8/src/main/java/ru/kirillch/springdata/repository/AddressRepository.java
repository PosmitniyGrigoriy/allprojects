package ru.kirillch.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.kirillch.springdata.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
