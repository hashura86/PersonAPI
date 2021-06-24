package com.digital.inovation.one.personAPI.repositories;


import com.digital.inovation.one.personAPI.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
