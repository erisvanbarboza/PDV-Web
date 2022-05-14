package com.vendas.vendas.Service;

import java.util.Optional;

import com.vendas.vendas.Model.Vendas;

public interface VendaService{
    Vendas add(Vendas vendas);
    Optional <Vendas> get(String id);
}


