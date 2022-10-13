package com.ecommerceweboneapi.restapi.modules.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceweboneapi.restapi.modules.product.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
