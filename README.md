# avalia-o-A3
Projeto acadêmico de um Sistema de Gestão de Projetos e Equipes em Java.
# Sistema de Gestão de Projetos e Equipes

## Descrição do Projeto

Este é um sistema desenvolvido em Java para a gestão de projetos e equipes, atendendo à necessidade de clientes da Oracle para um controle mais efetivo de suas demandas de trabalho. A aplicação permite o cadastro de usuários, projetos e equipes, além da alocação de equipes aos projetos.

## Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Arquitetura:** MVC (Model-View-Controller)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Gerenciamento de Dependências/Build:** Apache Maven (implícito no projeto)
- **Controle de Versão:** Git / GitHub

## Arquitetura e Estrutura do Projeto

O código está organizado seguindo o padrão MVC para garantir a separação de responsabilidades:

- `src/main/java/com/gestao/model/`: Contém as classes de domínio (POJOs) que representam as entidades do sistema (`Usuario`, `Projeto`, `Equipe`).
- `src/main/java/com/gestao/repository/`: Simula a camada de acesso a dados (DAO). Em vez de um banco de dados real, utiliza listas em memória para armazenar os dados durante a execução.
- `src/main/java/com/gestao/controller/`: Contém a lógica de negócio da aplicação, orquestrando as ações entre a View e o Model/Repository.
- `src/main/java/com/gestao/view/`: Contém a classe `Main.java`, que serve como uma View de console para simular a interação do usuário e demonstrar as funcionalidades do sistema.

## Como Executar

1. Clone o repositório.
2. Abra o projeto em sua IDE Java preferida (IntelliJ ou Eclipse).
3. Execute o método `main` na classe `Main.java` localizada em `src/main/java/com/gestao/view/`.
4. O console exibirá o resultado da execução das operações simuladas.

## Autor

- Caroline Piovesan Pinheiro
