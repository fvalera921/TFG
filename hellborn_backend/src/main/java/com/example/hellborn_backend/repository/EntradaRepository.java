package com.example.hellborn_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hellborn_backend.entity.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {

}
