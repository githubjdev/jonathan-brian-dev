package generic.crud;

public class TesteVeiculoRepository {

	  public static void main(String[] args) {
		  
		    VeiculoRepository repo = new VeiculoRepository();
			repo.salvar(new Veiculo(1L, "Peugeout", 99.00));
			repo.salvar(new Veiculo(2L, "Mercedez", 199.00));
			
			
			System.out.println("Todo os produtos: " + repo.listarTodos());
			
			System.out.println("-------------------------------------------");
			
			Veiculo p = repo.buscarPorId(1L);
			System.out.println("Buscando Produto :" + p);
			
			
			System.out.println("-------------------------------------------");
			
			repo.excluir(2L);
			System.out.println("Todo os produtos: " + repo.listarTodos());
	}
}
