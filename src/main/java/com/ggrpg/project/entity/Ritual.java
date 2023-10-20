package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "/ritual_tp")
public class Ritual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ritual;
    private Integer circulo;
    private String descricao;
    private Integer custo;
    private Integer pagina;

    public Ritual() {

    }

    public Ritual(Integer id_ritual, Integer circulo, String descricao, Integer custo, Integer pagina) {
        this.id_ritual = id_ritual;
        this.circulo = circulo;
        this.descricao = descricao;
        this.custo = custo;
        this.pagina = pagina;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getCirculo() {
        return circulo;
    }

    public void setCirculo(Integer circulo) {
        this.circulo = circulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCusto() {
        return custo;
    }

    public void setCusto(Integer custo) {
        this.custo = custo;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getId_ritual() {
        return id_ritual;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_ritual == null) ? 0 : id_ritual.hashCode());
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
        Ritual other = (Ritual) obj;
        if (id_ritual == null) {
            if (other.id_ritual != null)
                return false;
        } else if (!id_ritual.equals(other.id_ritual))
            return false;
        return true;
    }

}
