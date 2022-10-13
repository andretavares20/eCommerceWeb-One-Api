package com.ecommerceweboneapi.restapi.modules.product.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRODUTO_SUBCATEGORIA")
public class ProdutoSubCategoria implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "produtoSubCategoria")
    @JsonBackReference
    private List<Produto> produtos;

    @ManyToOne
    @JoinColumn(name="categoria_id", nullable=false)
    private ProdutoCategoria produtoCategoria;

    public ProdutoSubCategoria(){

    }

    public ProdutoSubCategoria(Long id, String nome, ProdutoCategoria produtoCategoria){
        this.id = id;
        this.nome = nome;
        this.produtoCategoria = produtoCategoria;
    }

}
