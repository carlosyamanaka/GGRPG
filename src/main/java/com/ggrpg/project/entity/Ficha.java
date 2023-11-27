package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ficha_tp")
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ficha;
    private String nomeDoPersonagem;
    private String nomeDoJogador;
    private String sistema;
    private String email_usuario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "ficha")
    private Propriedade propriedade;

    @JsonIgnore
    @OneToOne(mappedBy = "ficha", cascade = CascadeType.ALL, orphanRemoval = true)
    private Atributo atributo;

    @JsonIgnore
    @OneToOne(mappedBy = "ficha")
    private Inventario inventario;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Habilidade> habilidades;

    @JsonIgnore
    @OneToOne(mappedBy = "ficha")
    private Pericia pericia;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Ritual> rituais;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Ataque> ataques;
    
    public Ficha(Integer id_ficha, String nomeDoPersonagem, String nomeDoJogador, String sistema, String email_usuario) {
        this.id_ficha = id_ficha;
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.nomeDoJogador = nomeDoJogador;
        this.sistema = sistema;
        this.email_usuario = email_usuario;
    }

    // Quando a explicação de relacionamentos:
    /*
     * Um usuário tem várias (ou nenhuma) fichas, mas uma ficha só pode ter um
     * usuário -> relacionamento OneToMany
     * Nesse caso, a foreign key fica no lado em que tem muitos, guardando o ID da
     * outra tabela (fica em ficha, guardando o ID de Usuário)
     */

    // Um usuário pode ter muitas fichas (OneToMany), mas uma ficha só tem um
    // usuário (ManyToOne), nesse caso, vamos utilizar Many(fichas)to One(usuário),
    // capiche? -> Vá para usuário ver o resto da explicação
    // JoinColumn em id, nullable false pois uma ficha não pode ser criada sem um
    // usuário

}
