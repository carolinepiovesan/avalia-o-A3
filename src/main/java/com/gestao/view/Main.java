package com.gestao.view;

import com.gestao.controller.GestaoController;
import com.gestao.model.*;
import java.time.LocalDate;

/**
 * Ponto de entrada da aplicação.
 * Simula a interação do usuário e demonstra as funcionalidades do sistema.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("### INICIANDO SISTEMA DE GESTÃO DE PROJETOS ###");

        // 1. Inicializar o Controller
        GestaoController controller = new GestaoController();

        // 2. Criar dados iniciais (simulando usuários e equipes já cadastrados)
        System.out.println("\n--- Criando dados iniciais (usuários e equipes)... ---");
        Usuario gerente = new Usuario("Ana Silva", "111.111.111-11", "ana@oracle.com", "Gerente de Projetos", "ana.silva", "123", PerfilUsuario.GERENTE);
        Usuario dev1 = new Usuario("Carlos Souza", "222.222.222-22", "carlos@oracle.com", "Desenvolvedor Java", "carlos.souza", "456", PerfilUsuario.COLABORADOR);
        Usuario designer = new Usuario("Mariana Costa", "333.333.333-33", "mariana@oracle.com", "UI/UX Designer", "mariana.costa", "789", PerfilUsuario.COLABORADOR);

        Equipe equipeAlfa = new Equipe("Equipe Alfa", "Focada em desenvolvimento backend");
        equipeAlfa.adicionarMembro(dev1);

        Equipe equipeBeta = new Equipe("Equipe Beta", "Focada em interface e experiência do usuário");
        equipeBeta.adicionarMembro(designer);
        
        System.out.println("Dados iniciais criados com sucesso!");

        // 3. Simular a execução das funcionalidades
        System.out.println("\n--- Simulando a criação de um novo projeto... ---");
        Projeto projetoOracleDB = controller.criarNovoProjeto(
                "Novo Conector Oracle DB",
                "Desenvolvimento de um novo conector de alta performance para Oracle Database 23c",
                LocalDate.of(2025, 10, 1),
                LocalDate.of(2026, 3, 31),
                gerente
        );

        System.out.println("\n--- Simulando a alocação de equipes ao projeto... ---");
        controller.alocarEquipeAoProjeto(equipeAlfa, projetoOracleDB);
        controller.alocarEquipeAoProjeto(equipeBeta, projetoOracleDB);
        
        System.out.println("\n--- Simulando a alteração de status do projeto... ---");
        controller.alterarStatusProjeto(projetoOracleDB, StatusProjeto.EM_ANDAMENTO);


        // 4. Exibir o resultado final
        System.out.println("\n--- Exibindo todos os projetos cadastrados no sistema ---");
        for (Projeto p : controller.listarTodosProjetos()) {
            System.out.println(p);
        }

        System.out.println("\n### EXECUÇÃO FINALIZADA COM SUCESSO ###");
    }
}