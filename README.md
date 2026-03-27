# learning-java-mysql-connection
Projeto básico em Java utilizando JDBC para conexão com banco de dados MySQL.  Este projeto demonstra como estabelecer conexão, configurar credenciais e iniciar operações com o banco, servindo como base para aplicações CRUD.  

Tecnologias utilizadas: 
- Java 
- JDBC 
- MySQL

Para que o projeto funcione corretamente, é necessário configurar os dados de acesso ao banco de dados MySQL de acordo com o seu ambiente.

Altere as seguintes informações no código:

- URL do banco de dados
- Usuário
- Senha

Exemplo:

private String URL_Bancodedados = "jdbc:mysql://localhost:3306/seu_banco";
private String usuario = "seu_usuario";
private String senha = "sua_senha";

⚠️ Atenção:
Certifique-se de que o MySQL está em execução e que o banco de dados informado já foi criado.
