package livraria.jdbc;


import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	// executar como Java Aplication

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conexão Aberta com sucesso");
			connection.close();
			
	}

}
