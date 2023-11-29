package com.ggrpg.project.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "propriedade_tp")
public class Propriedade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_propriedade;
    private String origem;
    private String classe;
    private String trilha;
    private Integer nex;
    private Integer peRodada;
    private Integer peTot;
    private Integer peAtual;
    private Integer pvTot;
    private Integer pvAtual;
    private Integer deslocamento;
    private Integer sanidadeTot;
    private Integer sanidadeAtual;
    private Integer defesa;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = true)
    @JsonBackReference
    private Ficha ficha;

    // Criar ficha
    public Propriedade(Atributo atributo, Integer id_propriedade, String origem, String classe, Integer peTot,
            Integer pvTot, Integer sanidadeTot, Integer defesa) {
        this.id_propriedade = id_propriedade;
        this.origem = origem;
        this.classe = classe;
        this.nex = 5;
        this.peRodada = 1;

        if (classe == "combatente") {
            this.peTot = 2 + atributo.getPresenca();
        } else if (classe == "especialista") {
            this.peTot = 3 + atributo.getPresenca();
        } else if (classe == "ocultista") {
            this.peTot = 4 + atributo.getPresenca();
        }
        this.peAtual = peTot;
        if (classe == "combatente") {
            this.pvTot = 12 + atributo.getVigor();
        } else if (classe == "especialista") {
            this.pvTot = 16 + atributo.getVigor();
        } else if (classe == "ocultista") {
            this.pvTot = 20 + atributo.getVigor();
        }
        this.pvAtual = pvTot;
        this.deslocamento = 9;
        if (classe == "combatente") {
            this.sanidadeTot = 12;
        } else if (classe == "especialista") {
            this.sanidadeTot = 16;
        } else if (classe == "ocultista") {
            this.sanidadeTot = 20;
        }
        this.sanidadeAtual = sanidadeTot;
        this.defesa = 10 + atributo.getAgilidade();
    }

}
