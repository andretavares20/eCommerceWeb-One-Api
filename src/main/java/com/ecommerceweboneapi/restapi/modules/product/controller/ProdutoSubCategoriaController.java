package com.ecommerceweboneapi.restapi.modules.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceweboneapi.restapi.modules.product.model.ProdutoSubCategoria;
import com.ecommerceweboneapi.restapi.modules.product.repositories.ProdutoSubCategoriaRepository;

@RestController
@RequestMapping("/produtoSubCategoria")
@CrossOrigin
public class ProdutoSubCategoriaController {

    @Autowired
    private ProdutoSubCategoriaRepository produtoSubCategoriaRepository;
    
    @PostMapping
    public ResponseEntity<ProdutoSubCategoria> postProdutoSubCategoria(@RequestBody ProdutoSubCategoria produtoSubCategoria){
        return ResponseEntity.status(HttpStatus.OK).body(produtoSubCategoriaRepository.save(produtoSubCategoria));
    }
}
