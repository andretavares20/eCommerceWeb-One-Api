package com.ecommerceweboneapi.restapi.modules.product.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRODUTO_IMAGEM")
public class ProdutoImagem implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String imagem1;

    @Column(nullable = true)
    private String imagem2;

    @Column(nullable = true)
    private String imagem3;

    @Column(nullable = true)
    private String imagem4;

    @JsonIgnore
    @OneToOne(mappedBy = "produtoImagem")
    private Produto produto;

    public ProdutoImagem(){

    }

    public ProdutoImagem(Long id, String imagem1, String imagem2, String imagem3, String imagem4, Produto produto){
        this.id = id;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.imagem4 = imagem4;
        this.produto = produto;
    }



}
