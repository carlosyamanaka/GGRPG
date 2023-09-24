package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "/ritual_tp")
public class Ritual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private Integer circulo;
    private String descricao;
    private Integer custo;
    private Integer pagina;

    public Ritual() {

    }

    public Ritual(Integer id, Integer circulo, String descricao, Integer custo, Integer pagina) {
        this.id = id;
        this.circulo = circulo;
        this.descricao = descricao;
        this.custo = custo;
        this.pagina = pagina;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        Ritual other = (Ritual) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
