package com.juanex.productofinanciero_service_challengebackend.service.impl;

import com.juanex.productofinanciero_service_challengebackend.dto.ProductoFinancieroDTO;
import com.juanex.productofinanciero_service_challengebackend.mapper.ProductoFinancieroMapper;
import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import com.juanex.productofinanciero_service_challengebackend.repository.ProductoFinancieroRepository;
import com.juanex.productofinanciero_service_challengebackend.service.ProductoFinancieroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoFinancieroServiceImpl implements ProductoFinancieroService {
    private final ProductoFinancieroRepository repository;
    private final ProductoFinancieroMapper mapper;

    @Override
    public List<ProductoFinancieroDTO> obtenerProductosFinancierosPorCliente(String codigoCliente) {
        List<ProductoFinanciero> productoFinancieros = repository.findByClienteCodigo(codigoCliente);
          return mapper.toDTOList(productoFinancieros);
    }

    public ProductoFinanciero guardar(ProductoFinanciero productoFinanciero) {
        return repository.save(productoFinanciero);
    }

}
