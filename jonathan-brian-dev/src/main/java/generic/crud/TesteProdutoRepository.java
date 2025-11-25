package generic.crud;

public class TesteProdutoRepository {
	
	public static void main(String[] args) {
		ProdutoRepository repo = new ProdutoRepository();
		repo.salvar(new Produto(1L, "Mouse", 99.00));
		repo.salvar(new Produto(2L, "Teclado", 199.00));
		
		
		System.out.println("Todo os produtos: " + repo.listarTodos());
		
		System.out.println("-------------------------------------------");
		
		Produto p = repo.buscarPorId(1L);
		System.out.println("Buscando Produto :" + p);
		
		
		System.out.println("-------------------------------------------");
		
		repo.excluir(2L);
		System.out.println("Todo os produtos: " + repo.listarTodos());
		
	}

}
