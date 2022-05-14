package com.produtos.produtos.Service;

import java.util.Optional;

import com.produtos.produtos.Model.Produtos;
import com.produtos.produtos.Repository.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutosServiceImpl implements ProdutosService{
    @Autowired
    private ProdutosRepository repositorio;

    @Override
    public Produtos add(Produtos produto) {       
        return repositorio.save(produto);
    }

    @Override
    public Optional<Produtos> get(String id) {
        return repositorio.findById(id);
    }   
}
