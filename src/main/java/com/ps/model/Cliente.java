package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Clientes")
public class Cliente {
    @Id
    @Column(name="client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    public void setCliente(Long id) {
    }


   /* public void setCliente(Long cliente) {
        this.cliente = cliente;
    }*/
}


