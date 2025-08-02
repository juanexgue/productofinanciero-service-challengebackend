package com.juanex.productofinanciero_service_challengebackend.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producto_financiero")
public class ProductoFinanciero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoProducto;
    private String nombre;
    private String tipo;
    private String moneda;
    private BigDecimal saldo;
    private String clienteCodigo;

}
