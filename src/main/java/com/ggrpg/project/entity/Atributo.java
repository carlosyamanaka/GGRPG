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
@Table(name = "atributo_tp")
public class Atributo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_atributo;
    private Integer forca;
    private Integer agilidade;
    private Integer intelecto;
    private Integer vigor;
    private Integer presenca;

    @OneToOne
    @JoinColumn(name = "id_ficha", nullable = false)
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
