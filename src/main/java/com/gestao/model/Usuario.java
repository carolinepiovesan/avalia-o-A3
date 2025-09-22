package com.gestao.model;

/**
 * Classe que representa um Usuário do sistema.
 * Contém informações pessoais e de acesso.
 */
public class Usuario {
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private PerfilUsuario perfil;

    // Construtor
    public Usuario(String nomeCompleto, String cpf, String email, String cargo, String login, String senha, PerfilUsuario perfil) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", cargo='" + cargo + '\'' +
                ", perfil=" + perfil +
                '}';
    }
}