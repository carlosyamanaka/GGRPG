    package com.ggrpg.project.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.stereotype.Repository;

    import com.ggrpg.project.entity.Usuario;

    import java.util.Optional;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {



    }
