package com.example.hellborn_backend.DTO;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PedidoUsuarioDTO {

    private Float total;
    private String estado;
    private LocalDate fechaPedido;
    
}
