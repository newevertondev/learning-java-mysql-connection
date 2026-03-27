import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class ConexaoBancoDeDados {
	private Connection conexao;
	private String URL_Bancodedados = "jdbc:mysql://localhost:3306/nomeBD";
	private String usuario = "root";
	private String senha = "senhaBancoDeDados";

	public ConexaoBancoDeDados() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL_Bancodedados, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao acessar o banco de dados");
		}
	}

	public static void main(String[] args) throws SQLException 
	{
		ConexaoBancoDeDados conexao = new ConexaoBancoDeDados();

		if (conexao != null) {
			Statement inserir = conexao.conexao.createStatement();
			String query = "INSERT INTO pessoa(nome, endereco, telefone) VALUES ('Lucivania', 'Rua teste123', '34 992939392')";
			inserir.execute(query);
		}
	}
}
