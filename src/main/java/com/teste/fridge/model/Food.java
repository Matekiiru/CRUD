package com.teste.fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // define como entidade para o banco de dados e cria uma tabela
@Table(name="food_table") // cria a tabela com nome(Opcional)

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer quantity;
    private LocalDate expirationDate;

    public Food(Long id, String nome, Integer quantity, LocalDate expirationDate) {
        this.id = id;
        this.nome = nome;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
