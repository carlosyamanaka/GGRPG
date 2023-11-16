package com.ggrpg.project.ateste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ggrpg.project.entity.Ataque;
import com.ggrpg.project.entity.Ficha;
import com.ggrpg.project.entity.Ritual;
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

@Configuration
@Profile("test")
public class fichaAteste implements CommandLineRunner {

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

        Ficha f1 = new Ficha(1, "Arakaki", "Carlos", "Ordem");
        Ficha f2 = new Ficha(2, "AnotherName", "AnotherPlayer", "AnotherSystem");
        Ficha f3 = new Ficha(3, "YetAnotherName", "YetAnotherPlayer", "YetAnotherSystem");

        f1.setUsuario(u2);
        f2.setUsuario(u2);
        f3.setUsuario(u1);

        fichaRepository.saveAll(Arrays.asList(f1, f2, f3));

        Ataque a1 = new Ataque(1, "Facão", "teste", 10, "modificadores");
        Ataque a2 = new Ataque(2, "Facão", "teste", 10, "modificadores");
        Ataque a3 = new Ataque(3, "Facão", "teste", 10, "modificadores");

        a1.setFicha(f1);
        a2.setFicha(f2);
        a3.setFicha(f3);

        ataqueRepository.saveAll(Arrays.asList(a1, a2, a3));

        Ritual r1 = new Ritual(1, 1, "a", 1, 1, 1);
        Ritual r2 = new Ritual(2, 1, "a", 1, 1, 1);
        Ritual r3 = new Ritual(3, 1, "a", 1, 1, 1);

        r1.setFicha(f1);
        r2.setFicha(f2);
        r3.setFicha(f3);

        ritualRepository.saveAll(Arrays.asList(r1, r2, r3));
    }

}
