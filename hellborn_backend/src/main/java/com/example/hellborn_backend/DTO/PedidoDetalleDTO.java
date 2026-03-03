package com.example.hellborn_backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PedidoDetalleDTO {

    private Integer cantidad;
    private Float precioUnitario;
    private Float subtotal;

}
