package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.MerchandisingDTO;
import com.example.hellborn_backend.entity.Merchandising;

@Component
public class MerchandisingMapper {

    private final ModelMapper mapper = new ModelMapper();

    public MerchandisingDTO toDTO(Merchandising merchandising){
        return mapper.map(merchandising, MerchandisingDTO.class);
    }

    public Merchandising toEntity(MerchandisingDTO merchandisingDTO){
        return mapper.map(merchandisingDTO, Merchandising.class);
    }
}
