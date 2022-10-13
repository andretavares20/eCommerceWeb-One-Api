package com.ecommerceweboneapi.restapi.modules.product.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerceweboneapi.restapi.modules.product.model.ProdutoCategoria;

public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria,Long> {

    @Query(value = "SELECT * FROM produto_categoria ORDER BY nome ASC", nativeQuery = true)
    List<ProdutoCategoria> filterProdutoCategoria();
    
}