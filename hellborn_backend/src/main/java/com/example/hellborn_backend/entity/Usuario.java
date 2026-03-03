package com.example.hellborn_backend.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombreUsuario", unique = true)
    private String nombreUsuario;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "telefono")
    private Integer telefono; // CAMBIAR A NUMBER

    @Column(name = "rol")
    private String rol;

    @Column(name = "fechaRegistro")
    private LocalDate fechaRegistro;

    @OneToOne
    @JoinColumn(name = "idDireccion")
    private DireccionUsuario direccionUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<PedidoUsuario> pedido;

}
