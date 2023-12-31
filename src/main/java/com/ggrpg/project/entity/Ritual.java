package com.ggrpg.project.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "ritual_tp")
public class Ritual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ritual;
    private String circulo;
    private String descricao;
    private Integer pagina;

    @ManyToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    @JsonBackReference
    private Ficha ficha;

    public Ritual(Integer id_ritual, String circulo, String descricao, Integer custo, Integer pagina, Integer dt) {
        this.id_ritual = id_ritual;
        this.circulo = circulo;
        this.descricao = descricao;
        this.pagina = pagina;
    }

}
