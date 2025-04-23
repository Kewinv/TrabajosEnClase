package com.fortbank.ATM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fortbank.ATM.entity.Cliente;
import java.util.List;


public interface ClienteRepository extends JpaRepository<Cliente, Long>
{
    Optional<Cliente>  findByIdentificacion(String identificacion);
    
}
