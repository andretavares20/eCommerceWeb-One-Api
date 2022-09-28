package com.ecommerceweboneapi.restapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PRODUTO_CATEGORIA")
public class ProdutoCategoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany
    @JoinColumn(name = "categoria_id") 
    private List<Produto> produtos;

    public ProdutoCategoria(){
        
    }   

    public ProdutoCategoria(Long id,String nome,List<Produto> produtos){
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
    }
}
