import java.util.ArrayList;  // Importa a classe ArrayList para gerenciar listas dinâmicas
import java.util.Scanner;    // Importa a classe Scanner para leitura de dados do usuário

/**
 * Sistema de Gerenciamento de Funcionários
 * 
 * Este programa implementa um sistema simples para gerenciar funcionários de uma empresa.
 * Permite realizar as seguintes operacões:
 * - Cadastrar novos funcionários manualmente
 * - Listar todos os funcionários cadastrados
 * - Buscar funcionários por nome
 * - Inicializar o sistema com funcionários pré-cadastrados
 * 
 * O sistema utiliza uma interface de menu em console para interacão com o usuário.
 * 
 * @author Equipe de Desenvolvimento
 * @version 1.0
 */
public class Programa {

    // ==================== ATRIBUTOS DA CLASSE ====================
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();  // Lista para armazenar todos os funcionários
    static Scanner sc = new Scanner(System.in);                      // Scanner global para leitura de dados

    /**
     * Método principal do programa
     * 
     * Controla o fluxo principal da aplicacão, exibindo o menu de opcões
     * e direcionando para as funcionalidades escolhidas pelo usuário.
     * O programa executa em loop até que o usuário escolha a opcão de sair.
     * 
     * @param args - Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        cadastrarFuncionariosPadrao();  // Inicializa o sistema com funcionários padrão

        int opcao = 0;  // Variável para armazenar a opcão escolhida pelo usuário

        System.out.println("Sistema de Funcionarios");  // Exibe o título do sistema

        // Loop principal do menu - executa até o usuário escolher sair (opcão 4)
        while (opcao != 4) {
            // Exibe o menu de opcões
            System.out.println("\n1 Cadastrar funcionario");
            System.out.println("2 Listar funcionarios");
            System.out.println("3 Buscar funcionario");
            System.out.println("4 Sair");
            System.out.print("Escolha uma opcao ");
            
            opcao = sc.nextInt();   // Lê a opcão escolhida pelo usuário
            sc.nextLine();          // Limpa o buffer do Scanner para evitar problemas de leitura

            // Estrutura de decisão para executar a acão correspondente à opcão escolhida
            if (opcao == 1) {
                cadastrarFuncionario();     // Chama o método para cadastrar novo funcionário
            } else if (opcao == 2) {
                listarFuncionarios();       // Chama o método para listar funcionários
            } else if (opcao == 3) {
                buscarFuncionario();        // Chama o método para buscar funcionário
            } else if (opcao == 4) {
                System.out.println("\nSaindo do sistema");  // Mensagem de despedida
            } else {
                System.out.println("\nOpcao invalida");       // Trata opcões inválidas
            }
        }
    }

    /**
     * Método para cadastrar funcionários padrão
     * 
     * Inicializa o sistema com uma lista de funcionários pré-definidos
     * para facilitar os testes e demonstracão do sistema. Este método
     * é chamado automaticamente na inicializacão do programa.
     * Cadastra 7 funcionários de diferentes departamentos e cargos.
     */
    static void cadastrarFuncionariosPadrao() {
        // Adiciona funcionários pré-definidos ao ArrayList
        funcionarios.add(new Funcionario("Joao Silva", 28, "Desenvolvedor", 4500, "TI"));
        funcionarios.add(new Funcionario("Maria Santos", 32, "Analista de RH", 3800, "RH"));
        funcionarios.add(new Funcionario("Pedro Oliveira", 45, "Gerente de Vendas", 6500, "Vendas"));
        funcionarios.add(new Funcionario("Ana Costa", 29, "Contadora", 4200, "Financeiro"));
        funcionarios.add(new Funcionario("Carlos Mendes", 26, "Designer", 3500, "Marketing"));
        funcionarios.add(new Funcionario("Luciana Rocha", 38, "Coordenadora", 5200, "Operacoes"));
        funcionarios.add(new Funcionario("Rafael Torres", 31, "Analista de Sistemas", 4800, "TI"));
    }

    /**
     * Método para cadastro manual de funcionário
     * 
     * Permite ao usuário inserir um novo funcionário no sistema através
     * de interface interativa no console. Solicita todas as informacões
     * necessárias (nome, idade, cargo, salário e departamento) e
     * adiciona o funcionário à lista.
     */
    static void cadastrarFuncionario() {
        System.out.println("\nCadastro de Funcionario");  // Cabecalho da secão
        
        // Coleta o nome do funcionário
        System.out.print("Nome ");
        String nome = sc.nextLine();    // Lê o nome completo (permite espacos)

        // Coleta a idade do funcionário
        System.out.print("Idade ");
        int idade = sc.nextInt();       // Lê um número inteiro
        sc.nextLine();                  // Limpa o buffer após leitura de número

        // Coleta o cargo do funcionário
        System.out.print("Cargo ");
        String cargo = sc.nextLine();   // Lê o cargo (permite espacos)

        // Coleta o salário do funcionário
        System.out.print("Salario ");
        double salario = sc.nextDouble(); // Lê um número decimal
        sc.nextLine();                    // Limpa o buffer após leitura de número

        // Coleta o departamento do funcionário
        System.out.print("Departamento ");
        String departamento = sc.nextLine(); // Lê o departamento (permite espacos)

        // Cria um novo objeto Funcionario e adiciona à lista
        funcionarios.add(new Funcionario(nome, idade, cargo, salario, departamento));
        System.out.println("\nFuncionario cadastrado com sucesso");  // Confirma o cadastro
    }

    /**
     * Método para listar todos os funcionários
     * 
     * Exibe uma lista resumida de todos os funcionários cadastrados no sistema,
     * mostrando nome, cargo e departamento de cada um. Se não houver funcionários
     * cadastrados, exibe uma mensagem informativa. Ao final, mostra o total
     * de funcionários cadastrados.
     */
    static void listarFuncionarios() {
        System.out.println("\nLista de Funcionarios");  // Cabecalho da secão
        
        // Verifica se existem funcionários cadastrados
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado");  // Mensagem para lista vazia
            return;  // Sai do método se não há funcionários
        }

        // Loop para percorrer e exibir todos os funcionários
        for (Funcionario f : funcionarios) {
            // Exibe informacões resumidas: nome - cargo - departamento
            System.out.println(f.getNome() + " " + f.getCargo() + " " + f.getDepartamento());
        }
        
        // Exibe o total de funcionários cadastrados
        System.out.println("\nTotal " + funcionarios.size());
    }

    /**
     * Método para buscar funcionário por nome
     * 
     * Permite ao usuário buscar um funcionário específico digitando o nome.
     * A busca ignora diferencas entre maiúsculas e minúsculas (case-insensitive).
     * Se o funcionário for encontrado, exibe todas suas informacões completas.
     * Caso contrário, informa que o funcionário não foi encontrado.
     */
    static void buscarFuncionario() {
        System.out.println("\nBuscar Funcionario");  // Cabecalho da secão
        
        // Verifica se existem funcionários cadastrados
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado");  // Mensagem para lista vazia
            return;  // Sai do método se não há funcionários
        }

        // Solicita o nome a ser buscado
        System.out.print("Digite o nome ");
        String nomeBusca = sc.nextLine();       // Lê o nome a ser buscado
        boolean achou = false;                  // Flag para controlar se encontrou o funcionário

        // Loop para buscar o funcionário na lista
        for (Funcionario f : funcionarios) {
            // Compara os nomes ignorando diferencas de maiúscula/minúscula
            if (f.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("\n" + f);  // Exibe informacões completas do funcionário
                achou = true;                   // Marca que encontrou o funcionário
                break;                          // Sai do loop após encontrar
            }
        }

        // Se não encontrou o funcionário, exibe mensagem
        if (!achou) {
            System.out.println("\nFuncionario nao encontrado");
        }
    }
}

