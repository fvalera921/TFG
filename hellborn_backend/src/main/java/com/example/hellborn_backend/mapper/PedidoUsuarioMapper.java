package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.PedidoUsuarioDTO;
import com.example.hellborn_backend.entity.PedidoUsuario;

@Component
public class PedidoUsuarioMapper {

    private final ModelMapper mapper = new ModelMapper();

    public PedidoUsuarioDTO toDTO(PedidoUsuario pedidoUsuario) {
        return mapper.map(pedidoUsuario, PedidoUsuarioDTO.class);
    }

    public PedidoUsuario toEntity(PedidoUsuarioDTO pedidoUsuarioDTO) {
        return mapper.map(pedidoUsuarioDTO, PedidoUsuario.class);
    }
}
