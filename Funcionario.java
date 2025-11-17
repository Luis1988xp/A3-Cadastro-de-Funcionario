/**
 * Classe Funcionario
 * 
 * Esta classe representa um funcionário de uma empresa, contendo
 * informações básicas como nome, idade, cargo, salário e departamento.
 * Fornece métodos para acessar e modificar essas informações,
 * além de um método para exibir os dados formatados.
 */
public class Funcionario {

    // Atributos da classe - informações básicas do funcionário
    private String nome;         // Nome completo do funcionário
    private int idade;           // Idade em anos
    private String cargo;        // Cargo/função exercida na empresa
    private double salario;      // Salário em reais
    private String departamento; // Departamento onde trabalha

    /**
     * Construtor da classe Funcionario
     * 
     * Inicializa um novo funcionário com todas as informações básicas
     * necessárias para o cadastro no sistema.
     * 
     * @param nome - Nome completo do funcionário
     * @param idade - Idade do funcionário
     * @param cargo - Cargo exercido
     * @param salario - Salário em reais
     * @param departamento - Departamento de trabalho
     */
    public Funcionario(String nome, int idade, String cargo, double salario, String departamento) {
        this.nome = nome;                   // Atribui o nome recebido ao atributo da classe
        this.idade = idade;                 // Atribui a idade recebida ao atributo da classe
        this.cargo = cargo;                 // Atribui o cargo recebido ao atributo da classe
        this.salario = salario;             // Atribui o salário recebido ao atributo da classe
        this.departamento = departamento;   // Atribui o departamento recebido ao atributo da classe
    }

    // ==================== MÉTODOS GETTERS ====================
    // Os métodos getters permitem acessar os valores dos atributos privados

    /**
     * Retorna o nome do funcionário
     * @return String com o nome completo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a idade do funcionário
     * @return int com a idade em anos
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o cargo do funcionário
     * @return String com o cargo/função
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Retorna o salário do funcionário
     * @return double com o valor do salário
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Retorna o departamento do funcionário
     * @return String com o nome do departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    // ==================== MÉTODOS SETTERS ====================
    // Os métodos setters permitem modificar os valores dos atributos

    /**
     * Define um novo nome para o funcionário
     * @param nome - Novo nome a ser atribuído
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define uma nova idade para o funcionário
     * @param idade - Nova idade a ser atribuída
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Define um novo cargo para o funcionário
     * @param cargo - Novo cargo a ser atribuído
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Define um novo salário para o funcionário
     * @param salario - Novo salário a ser atribuído
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Define um novo departamento para o funcionário
     * @param departamento - Novo departamento a ser atribuído
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método toString - Exibe informações completas do funcionário
     * 
     * Formata e retorna uma string com todas as informações do funcionário
     * de forma organizada e legível, ideal para exibição no console.
     * 
     * @return String formatada com todas as informações do funcionário
     */
    public String toString() {
        return "Nome " + nome +                    // Exibe o nome
               "\nIdade " + idade +                // Exibe a idade
               "\nCargo " + cargo +                // Exibe o cargo
               "\nSalario R " + salario +          // Exibe o salário formatado
               "\nDepartamento " + departamento;   // Exibe o departamento
    }
}

