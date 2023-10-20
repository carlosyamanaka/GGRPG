package com.ggrpg.project.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "/pericia_tp")
public class Pericia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer acrobacia;
    private Integer adestramento;
    private Integer artes;
    private Integer atletismo;
    private Integer atualidades;
    private Integer ciencias;
    private Integer crime;
    private Integer diplomacia;
    private Integer enganacao;
    private Integer fortitude;
    private Integer furtividade;
    private Integer iniciativa;
    private Integer intimidacao;
    private Integer intuicao;
    private Integer investigacao;
    private Integer luta;
    private Integer medicina;
    private Integer ocultismo;
    private Integer percepcao;
    private Integer pilotagem;
    private Integer pontaria;
    private Integer profissao;
    private Integer reflexos;
    private Integer religiao;
    private Integer sobrevivencia;
    private Integer tatica;
    private Integer tecnologia;
    private Integer vontade;

    public Pericia() {

    }

    public Pericia(Integer id, Integer acrobacia, Integer adestramento, Integer artes, Integer atletismo,
            Integer atualidades, Integer ciencias, Integer crime, Integer diplomacia, Integer enganacao,
            Integer fortitude, Integer furtividade, Integer iniciativa, Integer intimidacao, Integer intuicao,
            Integer investigacao, Integer luta, Integer medicina, Integer ocultismo, Integer percepcao,
            Integer pilotagem, Integer pontaria, Integer profissao, Integer reflexos, Integer religiao,
            Integer sobrevivencia, Integer tatica, Integer tecnologia, Integer vontade) {
        this.id = id;
        this.acrobacia = acrobacia;
        this.adestramento = adestramento;
        this.artes = artes;
        this.atletismo = atletismo;
        this.atualidades = atualidades;
        this.ciencias = ciencias;
        this.crime = crime;
        this.diplomacia = diplomacia;
        this.enganacao = enganacao;
        this.fortitude = fortitude;
        this.furtividade = furtividade;
        this.iniciativa = iniciativa;
        this.intimidacao = intimidacao;
        this.intuicao = intuicao;
        this.investigacao = investigacao;
        this.luta = luta;
        this.medicina = medicina;
        this.ocultismo = ocultismo;
        this.percepcao = percepcao;
        this.pilotagem = pilotagem;
        this.pontaria = pontaria;
        this.profissao = profissao;
        this.reflexos = reflexos;
        this.religiao = religiao;
        this.sobrevivencia = sobrevivencia;
        this.tatica = tatica;
        this.tecnologia = tecnologia;
        this.vontade = vontade;
    }

    public Integer getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(Integer acrobacia) {
        this.acrobacia = acrobacia;
    }

    public Integer getAdestramento() {
        return adestramento;
    }

    public void setAdestramento(Integer adestramento) {
        this.adestramento = adestramento;
    }

    public Integer getArtes() {
        return artes;
    }

    public void setArtes(Integer artes) {
        this.artes = artes;
    }

    public Integer getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(Integer atletismo) {
        this.atletismo = atletismo;
    }

    public Integer getAtualidades() {
        return atualidades;
    }

    public void setAtualidades(Integer atualidades) {
        this.atualidades = atualidades;
    }

    public Integer getCiencias() {
        return ciencias;
    }

    public void setCiencias(Integer ciencias) {
        this.ciencias = ciencias;
    }

    public Integer getCrime() {
        return crime;
    }

    public void setCrime(Integer crime) {
        this.crime = crime;
    }

    public Integer getDiplomacia() {
        return diplomacia;
    }

    public void setDiplomacia(Integer diplomacia) {
        this.diplomacia = diplomacia;
    }

    public Integer getEnganacao() {
        return enganacao;
    }

    public void setEnganacao(Integer enganacao) {
        this.enganacao = enganacao;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(Integer furtividade) {
        this.furtividade = furtividade;
    }

    public Integer getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Integer iniciativa) {
        this.iniciativa = iniciativa;
    }

    public Integer getIntimidacao() {
        return intimidacao;
    }

    public void setIntimidacao(Integer intimidacao) {
        this.intimidacao = intimidacao;
    }

    public Integer getIntuicao() {
        return intuicao;
    }

    public void setIntuicao(Integer intuicao) {
        this.intuicao = intuicao;
    }

    public Integer getInvestigacao() {
        return investigacao;
    }

    public void setInvestigacao(Integer investigacao) {
        this.investigacao = investigacao;
    }

    public Integer getLuta() {
        return luta;
    }

    public void setLuta(Integer luta) {
        this.luta = luta;
    }

    public Integer getMedicina() {
        return medicina;
    }

    public void setMedicina(Integer medicina) {
        this.medicina = medicina;
    }

    public Integer getOcultismo() {
        return ocultismo;
    }

    public void setOcultismo(Integer ocultismo) {
        this.ocultismo = ocultismo;
    }

    public Integer getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(Integer percepcao) {
        this.percepcao = percepcao;
    }

    public Integer getPilotagem() {
        return pilotagem;
    }

    public void setPilotagem(Integer pilotagem) {
        this.pilotagem = pilotagem;
    }

    public Integer getPontaria() {
        return pontaria;
    }

    public void setPontaria(Integer pontaria) {
        this.pontaria = pontaria;
    }

    public Integer getProfissao() {
        return profissao;
    }

    public void setProfissao(Integer profissao) {
        this.profissao = profissao;
    }

    public Integer getReflexos() {
        return reflexos;
    }

    public void setReflexos(Integer reflexos) {
        this.reflexos = reflexos;
    }

    public Integer getReligiao() {
        return religiao;
    }

    public void setReligiao(Integer religiao) {
        this.religiao = religiao;
    }

    public Integer getSobrevivencia() {
        return sobrevivencia;
    }

    public void setSobrevivencia(Integer sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public Integer getTatica() {
        return tatica;
    }

    public void setTatica(Integer tatica) {
        this.tatica = tatica;
    }

    public Integer getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Integer tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Integer getVontade() {
        return vontade;
    }

    public void setVontade(Integer vontade) {
        this.vontade = vontade;
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
        Pericia other = (Pericia) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
