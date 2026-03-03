package com.example.hellborn_backend.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedido_usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PedidoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fechaPedido")
    private LocalDate fechaPedido;

    @Column(name = "total")
    private Float total;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "pedido")
    private Usuario usuario;

    @OneToMany(mappedBy = "pedido")
    private List<Entrada> entradas;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoDetalle> pedidosDetalle;
}
