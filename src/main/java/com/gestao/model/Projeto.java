package com.gestao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Projeto.
 * Contém informações sobre o escopo, prazos, status e equipes alocadas.
 */
public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private StatusProjeto status;
    private Usuario gerenteResponsavel;
    private List<Equipe> equipesAlocadas;

    // Construtor
    public Projeto(String nome, String descricao, LocalDate dataInicio, LocalDate dataTerminoPrevista, Usuario gerenteResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.gerenteResponsavel = gerenteResponsavel;
        this.status = StatusProjeto.PLANEJADO; // Todo projeto começa como planejado.
        this.equipesAlocadas = new ArrayList<>();
    }

    /**
     * Aloca uma equipe para trabalhar neste projeto.
     * @param equipe A equipe a ser alocada.
     */
    public void alocarEquipe(Equipe equipe) {
        this.equipesAlocadas.add(equipe);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\n--- Projeto ---" +
                "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nData de Início: " + dataInicio.format(formatter) +
                "\nData de Término: " + dataTerminoPrevista.format(formatter) +
                "\nStatus: " + status +
                "\nGerente: " + gerenteResponsavel.getNomeCompleto() +
                "\nEquipes Alocadas: " + equipesAlocadas;
    }
}