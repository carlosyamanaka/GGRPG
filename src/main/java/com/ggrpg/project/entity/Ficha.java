package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "/ficha_tp")
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoPersonagem;
    private String nomeDoJogador;
    private String sistema;

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

    // @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Usuario usuario;

    @OneToOne
    private Propriedade propriedade;

    @OneToOne
    private Atributo atributo;

    @OneToOne(mappedBy = "ficha")
    private Inventario inventario;

    @OneToMany(mappedBy = "ficha")
    private List<Habilidade> habilidades;

    @OneToOne(mappedBy = "ficha")
    private Pericia pericia;

    @ManyToMany(mappedBy = "ficha")
    @Transient
    private List<Ritual> rituais;

    @OneToMany(mappedBy = "ficha")
    private List<Ataque> ataques;

    public Ficha(Integer id, String nomeDoPersonagem, String nomeDoJogador, String sistema) {
        this.id = id;
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.nomeDoJogador = nomeDoJogador;
        this.sistema = sistema;
    }

    public String getNomeDoPersonagem() {
        return nomeDoPersonagem;
    }

    public void setNomeDoPersonagem(String nomeDoPersonagem) {
        this.nomeDoPersonagem = nomeDoPersonagem;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Integer getId() {
        return id;
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
        Ficha other = (Ficha) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
