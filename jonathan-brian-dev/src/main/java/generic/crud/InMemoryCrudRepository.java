package generic.crud;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryCrudRepository<T, ID> implements CrudRepository<T, ID> {

	/* Simula o banco de dados */
	protected List<T> banco = new ArrayList<T>();

	protected abstract ID getId(T entity);

	@Override
	public void salvar(T entity) {
		banco.add(entity);
	}
	
	@Override
	public T buscarPorId(ID id) {
		
		return banco
				.stream()
				.filter(e -> getId(e).equals(id))
				.findFirst().orElse(null);
	}
	
	@Override
	public List<T> listarTodos() {
		
		return banco;
	}
	
	
	@Override
	public void excluir(ID id) {
	    banco.removeIf(e -> getId(e).equals(id));
		
	}
	

}
