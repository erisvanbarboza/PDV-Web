package com.vendas.vendas.Repository;

import com.vendas.vendas.Model.Vendas;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends MongoRepository <Vendas, String> {
    
}
