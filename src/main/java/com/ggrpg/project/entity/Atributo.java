package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "/atributo_tp")
public class Atributo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private Integer forca;
    private Integer agilidade;
    private Integer intelecto;
    private Integer vigor;
    private Integer presenca;

    public Atributo() {

    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }

    public Integer getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(Integer intelecto) {
        this.intelecto = intelecto;
    }

    public Integer getVigor() {
        return vigor;
    }

    public void setVigor(Integer vigor) {
        this.vigor = vigor;
    }

    public Integer getPresenca() {
        return presenca;
    }

    public void setPresenca(Integer presenca) {
        this.presenca = presenca;
    }

    public Atributo(Integer forca, Integer agilidade, Integer intelecto, Integer vigor, Integer presenca) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.intelecto = intelecto;
        this.vigor = vigor;
        this.presenca = presenca;
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
        Atributo other = (Atributo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
