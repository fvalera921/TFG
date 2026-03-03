package com.example.hellborn_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hellborn_backend.entity.TipoEntrada;

public interface TipoEntradaRepository extends JpaRepository<TipoEntrada, Integer>{
    
}
