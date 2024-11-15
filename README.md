## 📋 Application Proposal

This application aims to be a manager for different sectors of a large corporate enterprise. It provides the ability to manage employees, clients, sectors, contracts, and documents. ## 🚀 Como Executar a Aplicação

## 🚀 How to Run the Application
Prerequisites
- JDK 17+
- Gradle
- MySQL
- Insomnia
- IDE (Intellij, Vscode or Eclipse)

## Aplicação ConneXus 

1\. **Clone the Repository::**

- Required tool: **Git Bash**:
https://git-scm.com/downloads

- Repository link:
https://github.com/R2DWess/connexus-hr


2\. **Configure the Database:**

🔧 Required tools::
- MySql or Postgreee

Access MySQL:
´´´java
´´´
cmd
mysql -u root -p

## 🗂️ Script do Banco de Dados

O script SQL para criar o banco de dados e as tabelas necessárias está incluso na seção de configuração do banco de dados:

mysql
CREATE DATABASE connexus;
USE connexus;


Execute a Aplicação:
cmd
java -Dexec.mainClass="org.example.ApplicationSystemStream"


## 📋 Funcionalidades da aplicação

- Gerencimento de funcionarios
    - **cadastrar:** CadastrarNovoFuncionario
    - **listar:** ListarFuncionarios
    - **deletar:** DeletarFuncionario
    - **Transferir:** TransferirFuncionario
    - **atualizar:** AtualizarDadoFuncionario
    - **consulta:** ConsultarFuncionario
    - **cadastrarSistema:** CadastrarFuncionarioSistema

- Tela de Login de Funcionarios
  **Email:** InsertEmailUser
  **Password:** InsertPasswordUser


## 🔧 Tecnologias Utilizadas
- Java
- MySQL
- Gradle
- Hibernate
- JUnit
- Git
- GitHub
- IntelliJ IDEA

## 🤝 Colaboradores
Meus agradecimentos e saudações a todos aqueles que, de alguma forma, sentiram-se intuisiasmado pelo projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesley-lima-244405251/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQEVAsL2UL6A0w/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1721323972268?e=1736985600&v=beta&t=bc--BknoVxbb5UlexqIoW4wjwj4xDrKbxZCSTinaMe8" width="100px;" alt="Foto do Wesley Lima"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](https://github.com/R2DWess/connexus-hr/blob/main/LICENSE) para mais detalhes.
