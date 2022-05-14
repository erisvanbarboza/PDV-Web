package com.produtos.produtos.Repository;

import com.produtos.produtos.Model.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends MongoRepository <Produtos, String> {
    
}
