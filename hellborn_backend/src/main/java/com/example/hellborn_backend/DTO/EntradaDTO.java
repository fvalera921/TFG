package com.example.hellborn_backend.DTO;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EntradaDTO {

    private LocalDate fechaCompra;
    private Integer cantidad;

}
