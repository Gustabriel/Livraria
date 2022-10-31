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
 * Servlet implementation class remover
 */
@WebServlet("/ExcluirLivro")
public class ExcluirLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ExcluirLivro() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int codlivro = Integer.parseInt(request.getParameter("codlivro"));
		TbLivros livro = new TbLivros();
		livro.setCodlivro(codlivro);
		try {
			TbLivrosDAO dao;
			dao = new TbLivrosDAO();
			dao.remover(livro);
			out.println("<html>");
			out.println("<body>");
			out.println("O Livro do código " + livro.getCodlivro()  + " foi apagado");
			out.println("</body>");
			out.println("</html>");
		}catch(Throwable e) {
			out.println("Deu ERRO");
			e.printStackTrace();
		}
	}

}
