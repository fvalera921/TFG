package com.example.hellborn_backend.DTO;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class UsuarioDTO {

    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private String telefono; // Cambiar a Integer
    private String rol; 
    private LocalDate fechaRegistro; 
    private Integer idDireccion; 
}
