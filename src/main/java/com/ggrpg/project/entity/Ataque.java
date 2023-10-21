package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ataque_tp")
public class Ataque implements Serializable {

    // 1. Instaciadas as entidades
    // 2. Adicionados equals e hashCodes para manipulação e comparação de objetos
    // 3. Declarados Getters and Setters (métodos de acesso e modificação)
    // 4. Implementado Serializable
    // 5. Adicionadas annotations principais (serializable, entity e id)
    // 6. Não foram adicionadas annotations @Data, @NoArgsConstructor nem
    // @AllArgsConstructor para melhor visualização da orientação a objetos

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String arma;
    private String teste;
    private Integer dano;
    private String modificadores;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Ficha ficha;

    public Ataque() {

    }

    public Ataque(String arma, String teste, Integer dano, String modificadores) {
        this.arma = arma;
        this.teste = teste;
        this.dano = dano;
        this.modificadores = modificadores;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public String getModificadores() {
        return modificadores;
    }

    public void setModificadores(String modificadores) {
        this.modificadores = modificadores;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public Integer getId() {
        return id;
    }

    /*
     * public void setId(Integer id) {
     * this.id = id;
     * }
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ataque other = (Ataque) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
