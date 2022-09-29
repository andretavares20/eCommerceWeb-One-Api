package com.ecommerceweboneapi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> listProduto(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

    @PostMapping
    public Produto postProduto(@RequestBody Produto produto){
        
        if(produto.getDescricao().length()>155){
            produto.setDescricaoResumo(produto.getDescricao());
        }else{
            produto.setDescricao_resumo(produto.getDescricao());
        }

        produtoRepository.save(produto);
        return produto;
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
