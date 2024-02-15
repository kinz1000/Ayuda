package com.example.ejdamdatos24.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejdamdatos24.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
