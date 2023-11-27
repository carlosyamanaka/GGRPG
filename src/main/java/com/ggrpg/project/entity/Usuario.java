package com.ggrpg.project.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
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
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_ficha", nullable = false)
    @ForeignKey(name = "pessoa_fk")
    private Ficha ficha = new Ficha();


    public Usuario(Integer id_usuario, String email) {
        this.id_usuario = id_usuario;
        this.email = email;
    }

    public Usuario(String email) {
        setEmail(email);
    }
}
