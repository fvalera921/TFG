package com.example.hellborn_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hellborn_backend.DTO.MerchandisingDTO;

@Service
public interface MerchandisingService {

    public List<MerchandisingDTO> findAll();

    public List<MerchandisingDTO> findByTipo(String tipo);

}
