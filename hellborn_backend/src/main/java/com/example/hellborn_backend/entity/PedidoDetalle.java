package com.example.hellborn_backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedido_detalle")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PedidoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precioUnitario")
    private Float precioUnitario;

    @Column(name = "subtotal")
    private Float subTotal;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private PedidoUsuario pedido;

   @ManyToOne
   @JoinColumn(name = "idMerchandising")
   private Merchandising merchandising;
}
