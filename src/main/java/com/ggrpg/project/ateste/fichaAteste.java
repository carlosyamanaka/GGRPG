package com.ggrpg.project.ateste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ggrpg.project.entity.Usuario;
import com.ggrpg.project.repository.AtaqueRepository;
import com.ggrpg.project.repository.AtributoRepository;
import com.ggrpg.project.repository.FichaRepository;
import com.ggrpg.project.repository.HabilidadeRepository;
import com.ggrpg.project.repository.InventarioRepository;
import com.ggrpg.project.repository.ItemRepository;
import com.ggrpg.project.repository.PericiaRepository;
import com.ggrpg.project.repository.PropriedadeRepository;
import com.ggrpg.project.repository.RitualRepository;
import com.ggrpg.project.repository.UsuarioRepository;


@Profile()
public class fichaAteste {

    // Essa classe serve para fazer o database seeding (popular o banco de dados com
    // albuns objetos, e para isso é preciso salvar dados lá -> Repository)

    @Autowired
    private AtaqueRepository ataqueRepository;

    @Autowired
    private AtributoRepository atributoRepository;

    @Autowired
    private FichaRepository fichaRepository;

    @Autowired
    private HabilidadeRepository habilidadeRepository;

    @Autowired
    private InventarioRepository inventarioRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PericiaRepository periciaRepository;

    @Autowired
    private PropriedadeRepository propriedadeRepository;

    @Autowired
    private RitualRepository ritualRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario u1 = new Usuario(1, "Pedro", "123", "pedro@gmail.com");
        Usuario u2 = new Usuario(2, "Carlos", "123", "carlos@gmail.com");
        Usuario u3 = new Usuario(3, "Vinicius", "123", "vinicius@gmail.com");

        usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
    }

}
