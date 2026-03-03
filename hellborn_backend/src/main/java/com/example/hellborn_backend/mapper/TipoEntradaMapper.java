package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.TipoEntradaDTO;
import com.example.hellborn_backend.entity.TipoEntrada;

@Component
public class TipoEntradaMapper {

    private final ModelMapper mapper = new ModelMapper();

    public TipoEntradaDTO toDTO(TipoEntrada tipoEntrada) {
        return mapper.map(tipoEntrada, TipoEntradaDTO.class);
    }

    public TipoEntrada toEntity(TipoEntradaDTO tipoEntradaDTO) {
        return mapper.map(tipoEntradaDTO, TipoEntrada.class);
    }
}
