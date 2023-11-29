package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
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
    private String limite_credito;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Item> items;

    public Inventario(Integer id_inventario, Integer capacidade, Integer lotacao,
            String limite_credito) {
        this.id_inventario = id_inventario;
        this.capacidade = capacidade;
        this.lotacao = lotacao;
        this.limite_credito = limite_credito;
    }

}
