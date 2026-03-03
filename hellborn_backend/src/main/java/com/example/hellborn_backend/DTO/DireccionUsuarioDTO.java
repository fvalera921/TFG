package com.example.hellborn_backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class DireccionUsuarioDTO {

    private String calle;
    private String numero; // Cambiar a Integer
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;
    
}
