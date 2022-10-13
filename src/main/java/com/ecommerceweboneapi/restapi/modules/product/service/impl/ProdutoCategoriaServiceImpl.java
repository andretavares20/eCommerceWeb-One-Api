package com.ecommerceweboneapi.restapi.modules.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceweboneapi.restapi.modules.product.model.ProdutoCategoria;
import com.ecommerceweboneapi.restapi.modules.product.repositories.ProdutoCategoriaRepository;
import com.ecommerceweboneapi.restapi.modules.product.service.ProdutoCategoriaService;

@Service
public class ProdutoCategoriaServiceImpl implements ProdutoCategoriaService {
    
    @Autowired
    private ProdutoCategoriaRepository produtoCategoriaRepository;

    @Override
    public List<ProdutoCategoria> listProdutoCategoria(){
        return produtoCategoriaRepository.filterProdutoCategoria();
    }
    



}
