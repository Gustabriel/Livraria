package livraria.jdbc;

public class TestarInserir {

	public static void main(String[] args) {
		TbCategoria tbcategoria = new TbCategoria();
		tbcategoria.setCategoria("Terror e Suspense");
		
		TbCategoriaDAO dao = new TbCategoriaDAO();
		dao.adicionar(tbcategoria);
		System.out.println("Gravado");

	}

}
