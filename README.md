# 📋 Sistema de Gerenciamento de Funcionários

Um sistema simples e eficiente para gerenciar funcionários de uma empresa, desenvolvido em Java com interface de console.

## 🎯 Sobre o Projeto

Este sistema permite realizar operações básicas de gerenciamento de funcionários, incluindo cadastro, listagem e busca. O programa foi desenvolvido com foco na simplicidade e facilidade de uso, sendo ideal para pequenas empresas ou como projeto educacional.

## ⚡ Funcionalidades

- ✅ **Cadastro de Funcionários**: Adicione novos funcionários com informações completas
- ✅ **Listagem de Funcionários**: Visualize todos os funcionários cadastrados
- ✅ **Busca por Nome**: Encontre funcionários específicos rapidamente
- ✅ **Dados Pré-cadastrados**: Sistema inicia com funcionários de exemplo
- ✅ **Interface Intuitiva**: Menu simples e fácil de navegar

## 🏗️ Estrutura do Projeto

```
P1 simples/
├── Funcionario.java    # Classe modelo para representar um funcionário
├── Programa.java       # Classe principal com o sistema de menu
└── README.md          # Documentação do projeto
```

## 📁 Arquivos do Sistema

### `Funcionario.java`
Classe que representa um funcionário da empresa, contendo:
- **Atributos**: nome, idade, cargo, salário, departamento
- **Construtor**: Inicializa um funcionário com todos os dados
- **Getters/Setters**: Métodos para acessar e modificar os atributos
- **toString()**: Formata e exibe as informações do funcionário

### `Programa.java`
Classe principal que controla o sistema, incluindo:
- **Menu interativo**: Interface de console para o usuário
- **Gerenciamento de dados**: Armazena funcionários em ArrayList
- **Operações CRUD**: Criar, listar e buscar funcionários
- **Dados de exemplo**: Funcionários pré-cadastrados para demonstração

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal/Prompt de comando

### Passos para execução

1. **Clone ou baixe o projeto**
   ```bash
   # Se estiver no Git
   git clone <url-do-repositorio>
   cd "P1 simples"
   ```

2. **Compile os arquivos Java**
   ```bash
   javac *.java
   ```

3. **Execute o programa**
   ```bash
   java Programa
   ```

## 🎮 Como Usar

Ao executar o programa, você verá um menu com as seguintes opções:

```
=== Sistema de Funcionários ===

1 - Cadastrar funcionário
2 - Listar funcionários  
3 - Buscar funcionário
4 - Sair
Escolha uma opção:
```

### 1️⃣ Cadastrar Funcionário
- Digite `1` e pressione Enter
- Insira as informações solicitadas:
  - Nome completo
  - Idade
  - Cargo
  - Salário
  - Departamento

### 2️⃣ Listar Funcionários
- Digite `2` e pressione Enter
- Visualize todos os funcionários cadastrados
- Veja o total de funcionários no sistema

### 3️⃣ Buscar Funcionário
- Digite `3` e pressione Enter
- Digite o nome do funcionário (não diferencia maiúsculas/minúsculas)
- Veja as informações completas se encontrado

### 4️⃣ Sair
- Digite `4` e pressione Enter para encerrar o programa

## 👥 Funcionários Pré-cadastrados

O sistema inicia com 7 funcionários de exemplo:

| Nome | Idade | Cargo | Salário | Departamento |
|------|-------|-------|---------|--------------|
| João Silva | 28 | Desenvolvedor | R$ 4.500 | TI |
| Maria Santos | 32 | Analista de RH | R$ 3.800 | RH |
| Pedro Oliveira | 45 | Gerente de Vendas | R$ 6.500 | Vendas |
| Ana Costa | 29 | Contadora | R$ 4.200 | Financeiro |
| Carlos Mendes | 26 | Designer | R$ 3.500 | Marketing |
| Luciana Rocha | 38 | Coordenadora | R$ 5.200 | Operações |
| Rafael Torres | 31 | Analista de Sistemas | R$ 4.800 | TI |

## 🔧 Características Técnicas

- **Linguagem**: Java
- **Estrutura de dados**: ArrayList
- **Entrada/Saída**: Scanner (console)
- **Paradigma**: Programação Orientada a Objetos
- **Busca**: Case-insensitive (ignora maiúsculas/minúsculas)
- **Validação**: Limpeza automática de buffer do Scanner

## 📚 Conceitos Demonstrados

Este projeto exemplifica os seguintes conceitos de programação:

- ✅ **Classes e Objetos**: Modelagem de entidades do mundo real
- ✅ **Encapsulamento**: Uso de getters e setters
- ✅ **Coleções**: Manipulação de ArrayList
- ✅ **Estruturas de Controle**: Loops e condicionais
- ✅ **Tratamento de Entrada**: Uso correto do Scanner
- ✅ **Documentação**: Comentários e Javadoc
- ✅ **Organização de Código**: Métodos bem estruturados

## 🔍 Exemplo de Uso

```
=== Sistema de Funcionários ===

1 - Cadastrar funcionário
2 - Listar funcionários
3 - Buscar funcionário
4 - Sair
Escolha uma opção: 2

=== Lista de Funcionários ===
João Silva - Desenvolvedor - TI
Maria Santos - Analista de RH - RH
Pedro Oliveira - Gerente de Vendas - Vendas
Ana Costa - Contadora - Financeiro
Carlos Mendes - Designer - Marketing
Luciana Rocha - Coordenadora - Operações
Rafael Torres - Analista de Sistemas - TI

Total: 7
```

## 🛠️ Possíveis Melhorias Futuras

- [ ] Salvar dados em arquivo
- [ ] Editar informações de funcionários existentes
- [ ] Remover funcionários
- [ ] Filtros por departamento ou cargo
- [ ] Relatórios de salários
- [ ] Interface gráfica (GUI)
- [ ] Validação de dados de entrada
- [ ] Backup automático

## 📞 Suporte

Se encontrar algum problema ou tiver sugestões:
1. Verifique se o Java está instalado corretamente
2. Certifique-se de que ambos os arquivos `.java` estão no mesmo diretório
3. Compile novamente os arquivos se necessário

---

**Sistema de RH v1.0** - Desenvolvido em Java ☕
