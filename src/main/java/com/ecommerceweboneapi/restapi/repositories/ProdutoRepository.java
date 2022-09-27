package com.ecommerceweboneapi.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceweboneapi.restapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
