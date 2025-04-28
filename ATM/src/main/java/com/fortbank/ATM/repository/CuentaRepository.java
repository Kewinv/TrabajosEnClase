package com.fortbank.ATM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fortbank.ATM.entity.Cliente;
import com.fortbank.ATM.entity.Cuenta;
import java.util.List;


public interface CuentaRepository extends JpaRepository<Cuenta, Long> 
{
    Optional<Cuenta>findByNumero(String numero);
    List<Cuenta>findByCliente(Cliente cliente);
}
