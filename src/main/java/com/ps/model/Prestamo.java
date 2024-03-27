package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Prestamos")

public class Prestamo {
    @Id
    @Column(name="loan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Cliente cliente;
    private BigDecimal monto;
    private BigDecimal tasaInteres;
    private Integer plazo;
    private LocalDate fechaInicio;
    private String estado;

    public void setPrestamo(Long id) {
    }

   /* public void setPrestamo(Long prestamo) {
        this.prestamo = prestamo;
    }*/
}
