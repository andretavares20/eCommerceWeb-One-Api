package com.ecommerceweboneapi.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceweboneapi.restapi.model.ProdutoCategoria;

public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria,Long> {
    
}
