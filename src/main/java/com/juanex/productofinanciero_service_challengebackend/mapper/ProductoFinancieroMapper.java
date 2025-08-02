package com.juanex.productofinanciero_service_challengebackend.mapper;

import com.juanex.productofinanciero_service_challengebackend.dto.ProductoFinancieroDTO;
import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoFinancieroMapper {
    ProductoFinancieroDTO toDTO(ProductoFinanciero entity);
    List<ProductoFinancieroDTO> toDTOList(List<ProductoFinanciero> entities);
}
