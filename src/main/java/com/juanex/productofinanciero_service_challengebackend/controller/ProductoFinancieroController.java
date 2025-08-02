package com.juanex.productofinanciero_service_challengebackend.controller;

import com.juanex.productofinanciero_service_challengebackend.dto.ProductoFinancieroDTO;
import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import com.juanex.productofinanciero_service_challengebackend.service.impl.ProductoFinancieroServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoFinancieroController {

    private final ProductoFinancieroServiceImpl service;

    @GetMapping("/cliente/{codigo}")
    public ResponseEntity<List<ProductoFinancieroDTO>> obtenerProductos(@PathVariable String codigo){
           return ResponseEntity.ok(service.obtenerProductosFinancierosPorCliente(codigo));
    }

    @PostMapping
    public ProductoFinanciero guardar(@RequestBody ProductoFinanciero producto){
        return service.guardar(producto);
    }
}
