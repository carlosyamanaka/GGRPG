package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuario_tp")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String username;
    private String senha;
    private String email;

    // Um usuário pode ter uma LISTA de fichas, e no caso do usuário vai ser (Um
    // usuário para muitas fichas -> One(Usuário) to Many!)
    @OneToMany(mappedBy = "usuario")
    private List<Ficha> fichas;

    public Usuario(Integer id_usuario, String username, String senha, String email) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.senha = senha;
        this.email = email;
    }

}
