package com.fortbank.ATM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fortbank.ATM.entity.Cuenta;
import com.fortbank.ATM.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long >
{
    List<Movimiento> findByCuenta(Cuenta cuenta);
    List<Movimiento> findByCuentaOrderByfechaDesc(Cuenta cuenta);
}
