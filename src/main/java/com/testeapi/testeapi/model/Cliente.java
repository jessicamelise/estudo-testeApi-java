package com.testeapi.testeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends AbstractEntity {

    @Column(nullable = false)
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
