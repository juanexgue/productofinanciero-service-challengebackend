package com.juanex.productofinanciero_service_challengebackend.service;

import com.juanex.productofinanciero_service_challengebackend.dto.ProductoFinancieroDTO;
import java.util.List;

public interface ProductoFinancieroService {
    List<ProductoFinancieroDTO> obtenerProductosFinancierosPorCliente(String codigo);
}
