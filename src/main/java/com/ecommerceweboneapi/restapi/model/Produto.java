package com.ecommerceweboneapi.restapi.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = true)
    private String descricao_resumo;

    @Column(nullable = false)
    private String imagem;

    @Column(nullable = false)
    private Double valor;

    @ManyToOne
    @JoinColumn(name="categoria_id", nullable=false)
    private ProdutoCategoria produtoCategoria;

    public Produto(){

    }

    public Produto(Long id, String nome, String descricao, String imagem, Double valor, ProdutoCategoria produtoCategoria){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.descricao_resumo = descricao.substring(0,155);
        this.imagem = imagem;
        this.valor = valor;
        this.produtoCategoria = produtoCategoria;
    }

    public void setDescricaoResumo(String descricao){
        this.descricao_resumo = descricao.substring(0,155);
    }



}
