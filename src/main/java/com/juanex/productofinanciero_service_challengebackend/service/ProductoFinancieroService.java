package com.juanex.productofinanciero_service_challengebackend.service;

import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import com.juanex.productofinanciero_service_challengebackend.repository.ProductoFinancieroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoFinancieroService {
    private ProductoFinancieroRepository repository;

    public ProductoFinancieroService(ProductoFinancieroRepository repository) {
        this.repository = repository;
    }

    public List<ProductoFinanciero> obtenerProductosFinancierosPorCliente(String clienteCodigo) {
        return repository.findByClienteCodigo(clienteCodigo);
    }

    public ProductoFinanciero guardar(ProductoFinanciero productoFinanciero) {
        return repository.save(productoFinanciero);
    }
}
