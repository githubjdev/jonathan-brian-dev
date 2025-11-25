package generic.crud;

import java.util.List;

public interface CrudRepository<T, ID> {
	
	void salvar(T entity);
	
	T buscarPorId(ID id);
	
	List<T> listarTodos();
	
	void excluir(ID id);

}
