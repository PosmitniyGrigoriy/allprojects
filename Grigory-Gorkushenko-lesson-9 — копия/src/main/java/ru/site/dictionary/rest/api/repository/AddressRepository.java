package ru.site.dictionary.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.site.dictionary.rest.api.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}