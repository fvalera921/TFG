package com.example.hellborn_backend.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_entrada")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TipoEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "tipoEntrada")
    private List<Entrada> entradas;
}
