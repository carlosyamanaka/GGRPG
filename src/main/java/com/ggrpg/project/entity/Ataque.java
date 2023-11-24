package com.ggrpg.project.entity;

import java.io.Serializable;

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
    private Integer id_ataque;
    private String nome;
    private String arma;
    private String teste;
    private Integer dano;

    @ManyToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    private Ficha ficha;

    public Ataque(Integer id_ataque,String nome,  String arma, String teste, Integer dano) {
        this.id_ataque = id_ataque;
        this.nome = nome;
        this.arma = arma;
        this.teste = teste;
        this.dano = dano;
    }

}
