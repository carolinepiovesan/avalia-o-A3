package com.gestao.repository;

import com.gestao.model.Projeto;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositório para gerenciar os projetos.
 * Simula um banco de dados em memória.
 */
public class ProjetoRepository {
    private final List<Projeto> projetos = new ArrayList<>();

    public void salvar(Projeto projeto) {
        projetos.add(projeto);
        System.out.println("[REPOSITORY] Projeto '" + projeto.getNome() + "' salvo com sucesso.");
    }

    public List<Projeto> buscarTodos() {
        System.out.println("[REPOSITORY] Buscando todos os projetos.");
        return projetos;
    }
}