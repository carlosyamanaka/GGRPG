package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "inventario_tp")
public class Inventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_inventario;
    private Integer capacidade;
    private Integer lotacao;
    private Integer[] capacidade_cat = new Integer[4];
    private String limite_credito;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    @OneToMany(mappedBy = "inventario")
    private List<Item> items;

    public Inventario(Integer id_inventario, Integer capacidade, Integer lotacao, Integer[] capacidade_cat,
            String limite_credito) {
        this.id_inventario = id_inventario;
        this.capacidade = capacidade;
        this.lotacao = lotacao;
        this.capacidade_cat = capacidade_cat;
        this.limite_credito = limite_credito;
    }

}
