package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.PedidoDetalleDTO;
import com.example.hellborn_backend.entity.PedidoDetalle;

@Component
public class PedidoDetalleMapper {

    private final ModelMapper mapper = new ModelMapper();

    public PedidoDetalleDTO toDTO(PedidoDetalle pedidoDetalle){
        return mapper.map(pedidoDetalle, PedidoDetalleDTO.class);
    }

    public PedidoDetalle toEntity(PedidoDetalleDTO pedidoDetalleDTO){
        return mapper.map(pedidoDetalleDTO, PedidoDetalle.class);
    }

}
