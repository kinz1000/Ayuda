package com.example.ejdamdatos24.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejdamdatos24.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
