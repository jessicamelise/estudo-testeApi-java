package com.testeapi.testeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto extends AbstractEntity {

    @Column(nullable = false)
    private String nomeProduto;

    @Column(nullable = false)
    private Double valor;

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }

}
