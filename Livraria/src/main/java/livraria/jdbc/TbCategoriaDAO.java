package livraria.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TbCategoriaDAO {
	
	private Connection connection;
	
	public TbCategoriaDAO() {
		// utilizar a classe ConnectionFactory para criar a conexão
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//Método INSERT
	public void adicionar(TbCategoria tbcategoria) {
		// o ponto de interrogação é uma mascara para variavel
		String sql = "insert into tbcategorias " + "(categoria)" + " values(?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// setar os valores
			stmt.setString(1, tbcategoria.getCategoria());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	
	//Método SELECT
	public List<TbCategoria> getLista() {
		try {
			List<TbCategoria> tbcategorias = new ArrayList<TbCategoria>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbcategorias");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				TbCategoria tbcategoria = new TbCategoria();
				tbcategoria.setCategoria(rs.getString("categoria"));
				tbcategorias.add(tbcategoria);
			}
			rs.close();
			stmt.close();
			return tbcategorias;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}