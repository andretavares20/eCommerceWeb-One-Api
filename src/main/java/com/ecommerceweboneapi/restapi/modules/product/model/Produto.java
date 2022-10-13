package com.ecommerceweboneapi.restapi.modules.product.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
    private Double valor;

    @Column(nullable = true)
    private String tamanho_sigla;

    @Column(nullable = true)
    private String tamanho_numero;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String sku;

    @ManyToOne
    @JoinColumn(name="subcategoria_id", nullable=false)
    private ProdutoSubCategoria produtoSubCategoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagem_id", referencedColumnName = "id")
    private ProdutoImagem produtoImagem;

    public Produto(){

    }

    public Produto(Long id, String nome, String descricao, Double valor, ProdutoSubCategoria produtoSubCategoria, ProdutoImagem produtoImagem,String tamanho_sigla,
    String tamanho_numero){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.descricao_resumo = descricao.substring(0,155);
        this.valor = valor;
        this.produtoSubCategoria = produtoSubCategoria;
        this.produtoImagem = produtoImagem;
        this.tamanho_numero = tamanho_numero;
        this.tamanho_sigla = tamanho_sigla;
    }

    public void setDescricaoResumo(String descricao){
        this.descricao_resumo = descricao.substring(0,155);
    }



}
