package com.fortbank.ATM.entity;

import java.util.List;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(unique = true)
    private String identificacion;
    private String pin;
    private boolean bloqueado;
    private int intentosFallidos;
    @OneToMany(mappedBy = "cliente" , cascade = cascadeType.ALL)
    private List<Cuenta> cuentas;
}
