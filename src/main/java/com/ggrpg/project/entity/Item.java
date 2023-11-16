package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "item_tp")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_item;
    private String nome;
    private Integer espaco;
    private String modificadores;
    private String teste;
    private String dano;
    private String alcance;
    private String efeito;

    @ManyToOne
    @JoinColumn(name = "id_inventario", nullable = false)
    private Inventario inventario;

    public Item(Integer id_item, String nome, Integer espaco, String modificadores, String teste, String dano,
            String alcance, String efeito) {
        this.id_item = id_item;
        this.nome = nome;
        this.espaco = espaco;
        this.modificadores = modificadores;
        this.teste = teste;
        this.dano = dano;
        this.alcance = alcance;
        this.efeito = efeito;
    }

}
