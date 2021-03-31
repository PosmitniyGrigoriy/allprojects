package ru.site.dictionary.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import ru.site.dictionary.rest.api.onetoone.Users;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	
    List<Users> findByFirstName(String firstName);

    @Query("select p from Person p order by firstName")
    List<Users> findAllOrderedByFirstName();
    
}
