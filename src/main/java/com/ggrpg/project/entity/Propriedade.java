package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    //Criar ficha
    public Propriedade(Integer nex, Integer id_propriedade, String origem, String classe, Integer peTot, Integer pvTot, Integer sanidadeTot, Integer defesa, Integer peAtual, Integer peRodada, Integer pvAtual, Integer deslocamento, Integer sanidadeAtual) {
        this.id_propriedade = id_propriedade;
        this.origem = origem;
        this.classe = classe;
        this.nex = nex;
        this.peRodada = peRodada;
        this.peTot = peTot;
        this.peAtual = peAtual;
        this.pvTot = pvTot;
        this.pvAtual = pvAtual;
        this.deslocamento = deslocamento;
        this.sanidadeTot = sanidadeTot;
        this.sanidadeAtual = sanidadeAtual;
        this.defesa = defesa;
    }

}
