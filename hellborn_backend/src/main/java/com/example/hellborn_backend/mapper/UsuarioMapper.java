package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hellborn_backend.DTO.UsuarioDTO;
import com.example.hellborn_backend.entity.Usuario;

@Component
public class UsuarioMapper {

    private final ModelMapper mapper = new ModelMapper();

    public UsuarioDTO toDTO(Usuario usuario) {
        return mapper.map(usuario, UsuarioDTO.class);
    }

    public Usuario toEntity(UsuarioDTO usuarioDTO) {
        return mapper.map(usuarioDTO, Usuario.class);
    }

}
