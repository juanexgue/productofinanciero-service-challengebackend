package com.juanex.productofinanciero_service_challengebackend.repository;

import com.juanex.productofinanciero_service_challengebackend.model.ProductoFinanciero;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoFinancieroRepository extends JpaRepository<ProductoFinanciero, Long> {
    List<ProductoFinanciero> findByClienteCodigo(String clienteCodigo);
}
