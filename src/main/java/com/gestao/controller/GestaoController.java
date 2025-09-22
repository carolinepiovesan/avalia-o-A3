package com.gestao.controller;

import com.gestao.model.*;
import com.gestao.repository.ProjetoRepository;
import java.time.LocalDate;
import java.util.List;

/**
 * Controller principal que gerencia a lógica de negócio do sistema.
 */
public class GestaoController {
    private final ProjetoRepository projetoRepository;

    public GestaoController() {
        this.projetoRepository = new ProjetoRepository();
    }

    /**
     * Cria um novo projeto e o salva no repositório.
     */
    public Projeto criarNovoProjeto(String nome, String desc, LocalDate inicio, LocalDate fim, Usuario gerente) {
        // Regra de negócio: Somente gerentes podem criar projetos.
        if (gerente.getPerfil() != PerfilUsuario.GERENTE) {
            System.out.println("[CONTROLLER-ERRO] Apenas usuários com perfil GERENTE podem criar projetos.");
            return null;
        }
        Projeto novoProjeto = new Projeto(nome, desc, inicio, fim, gerente);
        projetoRepository.salvar(novoProjeto);
        return novoProjeto;
    }

    /**
     * Aloca uma equipe a um projeto existente.
     */
    public void alocarEquipeAoProjeto(Equipe equipe, Projeto projeto) {
        if (projeto != null && equipe != null) {
            projeto.alocarEquipe(equipe);
            System.out.println("[CONTROLLER] Equipe '" + equipe.getNome() + "' alocada ao projeto '" + projeto.getNome() + "'.");
        }
    }
    
    /**
     * Altera o status de um projeto.
     */
     public void alterarStatusProjeto(Projeto projeto, StatusProjeto novoStatus) {
         if (projeto != null) {
             projeto.setStatus(novoStatus);
             System.out.println("[CONTROLLER] Status do projeto '" + projeto.getNome() + "' alterado para " + novoStatus);
         }
     }

    /**
     * Retorna a lista de todos os projetos cadastrados.
     */
    public List<Projeto> listarTodosProjetos() {
        return projetoRepository.buscarTodos();
    }
}