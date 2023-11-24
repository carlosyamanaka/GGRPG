package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @OneToOne(mappedBy = "ficha")
    private Inventario inventario;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Habilidade> habilidades;

    @OneToOne(mappedBy = "ficha")
    private Pericia pericia;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Ritual> rituais;

    @JsonIgnore
    @OneToMany(mappedBy = "ficha")
    private List<Ataque> ataques;

    public Ficha(Integer id_ficha, String nomeDoPersonagem, String nomeDoJogador, String sistema) {
        this.id_ficha = id_ficha;
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.nomeDoJogador = nomeDoJogador;
        this.sistema = sistema;
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
