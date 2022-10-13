package com.ecommerceweboneapi.restapi.modules.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceweboneapi.restapi.modules.product.model.ProdutoCategoria;
import com.ecommerceweboneapi.restapi.modules.product.repositories.ProdutoCategoriaRepository;





@RestController
@RequestMapping("/produtoCategoria")
@CrossOrigin
public class ProdutoCategoriaController {

    @Autowired
    private ProdutoCategoriaRepository produtoCategoriaRepository;

    @GetMapping
    public ResponseEntity<List<ProdutoCategoria>> listProdutoCategoria(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoCategoriaRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<ProdutoCategoria> postProdutoCategoria(@RequestBody ProdutoCategoria produtoCategoria){
        return ResponseEntity.status(HttpStatus.OK).body(produtoCategoriaRepository.save(produtoCategoria));
    }
    
}
