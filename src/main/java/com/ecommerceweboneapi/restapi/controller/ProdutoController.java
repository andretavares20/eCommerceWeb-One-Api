package com.ecommerceweboneapi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceweboneapi.restapi.model.Produto;
import com.ecommerceweboneapi.restapi.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listProduto(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public void postProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
    }

    @PutMapping
    public void putProduto(@RequestBody Produto produto){
        if(produto.getId()>0){
            produtoRepository.save(produto);
        }
    }

    @DeleteMapping
    public void deleteProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }
    
}
