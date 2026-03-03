package com.example.hellborn_backend.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hellborn_backend.DTO.MerchandisingDTO;
import com.example.hellborn_backend.mapper.MerchandisingMapper;
import com.example.hellborn_backend.repository.MerchandisingRepository;
import com.example.hellborn_backend.service.MerchandisingService;

@Service

public class MerchandisingServiceImpl implements MerchandisingService {

    private MerchandisingRepository repository;
    private MerchandisingMapper mapper;

    public MerchandisingServiceImpl(MerchandisingRepository repository, MerchandisingMapper mapper) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<MerchandisingDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<MerchandisingDTO> findByTipo(String tipo) {
        return repository.findByTipo(tipo).stream().map(mapper::toDTO).toList();
    }

}