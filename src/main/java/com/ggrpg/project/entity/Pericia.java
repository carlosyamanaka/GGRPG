package com.ggrpg.project.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pericia_tp")
public class Pericia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pericia;
    private Integer acrobacia;
    private Integer adestramento;
    private Integer artes;
    private Integer atletismo;
    private Integer atualidades;
    private Integer ciencias;
    private Integer crime;
    private Integer diplomacia;
    private Integer enganacao;
    private Integer fortitude;
    private Integer furtividade;
    private Integer iniciativa;
    private Integer intimidacao;
    private Integer intuicao;
    private Integer investigacao;
    private Integer luta;
    private Integer medicina;
    private Integer ocultismo;
    private Integer percepcao;
    private Integer pilotagem;
    private Integer pontaria;
    private Integer profissao;
    private Integer reflexos;
    private Integer religiao;
    private Integer sobrevivencia;
    private Integer tatica;
    private Integer tecnologia;
    private Integer vontade;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = true)
    @JsonBackReference
    private Ficha ficha;

    public Pericia(Integer id_pericia, Integer acrobacia, Integer adestramento, Integer artes, Integer atletismo,
            Integer atualidades, Integer ciencias, Integer crime, Integer diplomacia, Integer enganacao,
            Integer fortitude, Integer furtividade, Integer iniciativa, Integer intimidacao, Integer intuicao,
            Integer investigacao, Integer luta, Integer medicina, Integer ocultismo, Integer percepcao,
            Integer pilotagem, Integer pontaria, Integer profissao, Integer reflexos, Integer religiao,
            Integer sobrevivencia, Integer tatica, Integer tecnologia, Integer vontade) {

        this.id_pericia = id_pericia;
        this.acrobacia = acrobacia;
        this.adestramento = adestramento;
        this.artes = artes;
        this.atletismo = atletismo;
        this.atualidades = atualidades;
        this.ciencias = ciencias;
        this.crime = crime;
        this.diplomacia = diplomacia;
        this.enganacao = enganacao;
        this.fortitude = fortitude;
        this.furtividade = furtividade;
        this.iniciativa = iniciativa;
        this.intimidacao = intimidacao;
        this.intuicao = intuicao;
        this.investigacao = investigacao;
        this.luta = luta;
        this.medicina = medicina;
        this.ocultismo = ocultismo;
        this.percepcao = percepcao;
        this.pilotagem = pilotagem;
        this.pontaria = pontaria;
        this.profissao = profissao;
        this.reflexos = reflexos;
        this.religiao = religiao;
        this.sobrevivencia = sobrevivencia;
        this.tatica = tatica;
        this.tecnologia = tecnologia;
        this.vontade = vontade;
    }

}
