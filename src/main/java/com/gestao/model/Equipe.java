package com.gestao.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma Equipe de trabalho.
 * Uma equipe é composta por um conjunto de usuários.
 */
public class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros;

    // Construtor
    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }

    /**
     * Adiciona um novo membro à equipe.
     * @param usuario O usuário a ser adicionado.
     */
    public void adicionarMembro(Usuario usuario) {
        this.membros.add(usuario);
    }

    // Getters
    public String getNome() {
        return nome;
    }
    
    public List<Usuario> getMembros() {
        return membros;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "nome='" + nome + '\'' +
                ", membros=" + membros.size() +
                '}';
    }
}