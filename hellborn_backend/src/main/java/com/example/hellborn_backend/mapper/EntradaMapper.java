package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.EntradaDTO;
import com.example.hellborn_backend.entity.Entrada;

@Component
public class EntradaMapper {

    private final ModelMapper mapper = new ModelMapper();

    public EntradaDTO toDTO(Entrada entrada) {
        return mapper.map(entrada, EntradaDTO.class);
    }

    public Entrada toEntity(EntradaDTO entradaDTO) {
        return mapper.map(entradaDTO, Entrada.class);
    }

}
