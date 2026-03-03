package com.example.hellborn_backend.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hellborn_backend.DTO.TipoEntradaDTO;
import com.example.hellborn_backend.mapper.TipoEntradaMapper;
import com.example.hellborn_backend.repository.TipoEntradaRepository;
import com.example.hellborn_backend.service.TipoEntradaService;

@Service
public class TipoEntradaServiceImpl implements TipoEntradaService {
    private TipoEntradaRepository repository;
    private TipoEntradaMapper mapper;

    public TipoEntradaServiceImpl(TipoEntradaRepository repository, TipoEntradaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<TipoEntradaDTO> findAll() {
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }
}
