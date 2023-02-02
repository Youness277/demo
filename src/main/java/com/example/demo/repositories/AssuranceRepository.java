package com.example.demo.repositories;


import com.example.demo.entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

    Assurance findAssuranceById(Long id);

}
