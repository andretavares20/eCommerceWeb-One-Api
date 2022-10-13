package com.ecommerceweboneapi.restapi.modules.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceweboneapi.restapi.modules.product.model.ProdutoSubCategoria;

public interface ProdutoSubCategoriaRepository extends JpaRepository<ProdutoSubCategoria,Long>{
    
}
