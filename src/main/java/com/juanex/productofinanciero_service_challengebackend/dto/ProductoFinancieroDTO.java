package com.juanex.productofinanciero_service_challengebackend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductoFinancieroDTO {
    private String tipo;
    private String nombre;
    private BigDecimal saldo;
}
