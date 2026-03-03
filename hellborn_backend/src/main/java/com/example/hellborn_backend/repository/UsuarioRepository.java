package com.example.hellborn_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hellborn_backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
