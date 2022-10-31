package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livraria.jdbc.TbLivros;
import livraria.jdbc.TbLivrosDAO;

@WebServlet("/ListaCategoria")
public class ListaCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaCategoria() {
        super();
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TbLivrosDAO dao = new TbLivrosDAO();
		PrintWriter out = response.getWriter();

		
		List<TbLivros> livros = dao.getLista();
		
		for(TbLivros livro : livros) {
			out.println("Código: " + livro.getCodlivro());
			out.println("Titulo: " + livro.getTitulo());
			out.println("Autor: " + livro.getAutor());
			out.println("Categoria: " + livro.getCategoria());
			out.println("Valor: R$" + livro.getValor());
			out.println("----------------------------------------------------");
		} 
		
	}

}




























