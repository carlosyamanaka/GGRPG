package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
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
@Table(name = "habilidade_tp")
public class Habilidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, updatable = false)
    private Integer id_habilidade;
    private String descricao;
    private Integer pagina;

    @ManyToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    public Habilidade(Integer id_habilidade, String descricao, Integer pagina) {
        this.id_habilidade = id_habilidade;
        this.descricao = descricao;
        this.pagina = pagina;
    }

}
