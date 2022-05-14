package com.vendas.vendas.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("vendas")
public class Vendas {
    @Id
    private String id;
    private String produto;
    private int quantProdutos;
    private float valorUn;
    private float valorTotal;

    
    public Vendas(String produto, int quantProdutos, float valorUn, float valorTotal) {
        this.produto = produto;
        this.quantProdutos = quantProdutos;
        this.valorUn = valorUn;
        this.valorTotal = valorTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantProdutos() {
        return quantProdutos;
    }

    public void setQuantProdutos(int quantProdutos) {
        this.quantProdutos = quantProdutos;
    }

    public float getValorUn() {
        return valorUn;
    }

    public void setValorUn(float valorUn) {
        this.valorUn = valorUn;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }    
}
