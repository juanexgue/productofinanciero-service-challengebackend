package com.juanex.productofinanciero_service_challengebackend.controller;

import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import com.juanex.productofinanciero_service_challengebackend.service.ProductoFinancieroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoFinancieroController {

    private ProductoFinancieroService service;

    public ProductoFinancieroController(ProductoFinancieroService service) {
        this.service = service;
    }

    @GetMapping("/cliente/{codigo}")
    public List<ProductoFinanciero> obtenerProductos(@PathVariable String codigo){
        return service.obtenerProductosFinancierosPorCliente(codigo);
    }

    @PostMapping
    public ProductoFinanciero guardar(@RequestBody ProductoFinanciero producto){
        return service.guardar(producto);
    }
}
