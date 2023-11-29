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
@Table(name = "atributo_tp")
public class Atributo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_atributo;
    private Integer forca;
    private Integer agilidade;
    private Integer intelecto;
    private Integer presenca;
    private Integer vigor;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = true)
    @JsonBackReference
    private Ficha ficha;

    public Atributo(Integer id_atributo, Integer forca, Integer agilidade, Integer intelecto, Integer vigor,
            Integer presenca) {
        this.id_atributo = id_atributo;
        this.forca = forca;
        this.agilidade = agilidade;
        this.intelecto = intelecto;
        this.vigor = vigor;
        this.presenca = presenca;
    }

}
