package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Livraria
 */
@WebServlet("/Livraria/Livraria")
public class Livraria extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<head>");
			out.println("<title>Livraria FGE</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h1>Livraria FGE</h1>");
				out.println("<h5>Gabriel Gustavo - 27422623   |   Fabio Luiz Teixeira - 28031270   |   Erick Vasco - 26150086 </h5>");
				out.println("<h2>Menu:</h2>");
				out.println("<a href='http://localhost:8080/Livraria/ListaLivrosPorCategoria.html'><h3>---> Listar Livros por categoria</h3></a>");
				out.println("<a href='http://localhost:8080/Livraria/Cadastrar.html'><h3>--->  Cadastrar ou Excluir Livro</h3></a>");
				out.println("<a href='http://localhost:8080/Livraria/Alterar.html'><h3>--->  Alterar Livro</h3></a>");
				out.println("<a href='http://localhost:8080/Livraria/Consultar.html'><h3>---> Pesquisar Livros</h3></a>");

			out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
