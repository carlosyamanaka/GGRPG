package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "/propriedade_tp")
public class Propriedade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
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

    public Propriedade() {

    }

    public Propriedade(Integer id, String origem, String classe, String trilha, Integer nex, Integer peRodada,
            Integer peTot, Integer pvTot, Integer deslocamento, Integer sanidadeTot, Integer defesa,
            String resistencia) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTrilha() {
        return trilha;
    }

    public void setTrilha(String trilha) {
        this.trilha = trilha;
    }

    public Integer getNex() {
        return nex;
    }

    public void setNex(Integer nex) {
        this.nex = nex;
    }

    public Integer getPeRodada() {
        return peRodada;
    }

    public void setPeRodada(Integer peRodada) {
        this.peRodada = peRodada;
    }

    public Integer getPeTot() {
        return peTot;
    }

    public void setPeTot(Integer peTot) {
        this.peTot = peTot;
    }

    public Integer getPvTot() {
        return pvTot;
    }

    public void setPvTot(Integer pvTot) {
        this.pvTot = pvTot;
    }

    public Integer getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(Integer deslocamento) {
        this.deslocamento = deslocamento;
    }

    public Integer getSanidadeTot() {
        return sanidadeTot;
    }

    public void setSanidadeTot(Integer sanidadeTot) {
        this.sanidadeTot = sanidadeTot;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Propriedade other = (Propriedade) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
