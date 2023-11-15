package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Pericia;
import com.ggrpg.project.repository.PericiaRepository;

@Service
public class PericiaService {

    @Autowired
    private PericiaRepository repository;

    public List<Pericia> findAll() {
        return repository.findAll();
    }

    public Pericia findById(Integer id) {
        Optional<Pericia> obj = repository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Pericia insert(Pericia obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Pericia update(Integer id, Pericia obj) {
        Pericia entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Pericia entity, Pericia obj) {
        entity.setAcrobacia(obj.getAcrobacia());
        entity.setAdestramento(obj.getAdestramento());
        entity.setArtes(obj.getArtes());
        entity.setAtletismo(obj.getAtletismo());
        entity.setAtualidades(obj.getAtualidades());
        entity.setCiencias(obj.getCiencias());
        entity.setCrime(obj.getCrime());
        entity.setDiplomacia(obj.getDiplomacia());
        entity.setEnganacao(obj.getEnganacao());
        entity.setFortitude(obj.getFortitude());
        entity.setFurtividade(obj.getFurtividade());
        entity.setIniciativa(obj.getIniciativa());
        entity.setIntimidacao(obj.getIntimidacao());
        entity.setIntuicao(obj.getIntuicao());
        entity.setInvestigacao(obj.getInvestigacao());
        entity.setLuta(obj.getLuta());
        entity.setMedicina(obj.getMedicina());
        entity.setOcultismo(obj.getOcultismo());
        entity.setPercepcao(obj.getPercepcao());
        entity.setPilotagem(obj.getPilotagem());
        entity.setPontaria(obj.getPontaria());
        entity.setProfissao(obj.getProfissao());
        entity.setReflexos(obj.getReflexos());
        entity.setReligiao(obj.getReligiao());
        entity.setSobrevivencia(obj.getSobrevivencia());
        entity.setTatica(obj.getTatica());
        entity.setTecnologia(obj.getTecnologia());
        entity.setVontade(obj.getVontade());
    }
}
