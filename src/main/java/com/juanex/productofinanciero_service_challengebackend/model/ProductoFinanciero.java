package com.juanex.productofinanciero_service_challengebackend.model;

import jakarta.persistence.*;

public class ProductoFinanciero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoProducto;
    private String nombre;
    private String tipo;
    private String moneda;
    private String saldo;
    private String clienteCodigo;

}
