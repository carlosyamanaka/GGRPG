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
@Table(name = "/propriedade_tp")
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
    private Integer pvTot;
    private Integer deslocamento;
    private Integer sanidadeTot;
    private Integer defesa;
    private String resistencia;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    public Propriedade(Integer id_propriedade, String origem, String classe, String trilha, Integer nex,
            Integer peRodada, Integer peTot, Integer pvTot, Integer deslocamento, Integer sanidadeTot, Integer defesa,
            String resistencia) {
        this.id_propriedade = id_propriedade;
        this.origem = origem;
        this.classe = classe;
        this.trilha = trilha;
        this.nex = nex;
        this.peRodada = peRodada;
        this.peTot = peTot;
        this.pvTot = pvTot;
        this.deslocamento = deslocamento;
        this.sanidadeTot = sanidadeTot;
        this.defesa = defesa;
        this.resistencia = resistencia;
    }

}
