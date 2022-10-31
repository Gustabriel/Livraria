package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livraria.jdbc.TbLivros;
import livraria.jdbc.TbLivrosDAO;

/**
 * Servlet implementation class Adicionar
 */
@WebServlet("/AlterarLivro")
public class AlterarLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarLivro() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		int codlivro;
		codlivro = Integer.parseInt(request.getParameter("codlivro"));
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String categoria = request.getParameter("categorias");
		float valor;
		valor = Integer.parseInt(request.getParameter("valor"));

		TbLivros livro = new TbLivros();
		livro.setCodlivro(codlivro);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setCategoria(categoria);
		livro.setValor(valor);
		try {
			TbLivrosDAO dao;
			dao = new TbLivrosDAO();
			dao.alterar(livro);
			out.println("<html>");
			out.println("<body>");
			out.println("O Livro " + livro.getTitulo() + " foi alterado");
			out.println("</body>");
			out.println("</html>");
		}catch(Throwable e) {
			out.println("Deu ERRO");
			e.printStackTrace();
		}
	}

}