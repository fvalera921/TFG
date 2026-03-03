package com.example.hellborn_backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "merchandising")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Merchandising {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "url_img")
    private String urlImg;

    @OneToMany(mappedBy = "merchandising")
    private List<PedidoDetalle> pedidosDetalle;
}
