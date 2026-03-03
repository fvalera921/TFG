package com.example.hellborn_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hellborn_backend.DTO.TipoEntradaDTO;

@Service
public interface TipoEntradaService {

    public List<TipoEntradaDTO> findAll();
}
