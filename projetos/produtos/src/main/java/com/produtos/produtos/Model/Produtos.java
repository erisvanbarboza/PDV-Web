package com.produtos.produtos.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("produtos")
public class Produtos {
    @Id
    private String id;
    private String nome;
    private int quantEstoque;
    private float valorUn;
    
    public Produtos(String nome, int quantEstoque, float valorUn) {
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.valorUn = valorUn;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantEstoque() {
        return quantEstoque;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    public float getValorUn() {
        return valorUn;
    }
    public void setValorUn(float valorUn) {
        this.valorUn = valorUn;
    }        
}
