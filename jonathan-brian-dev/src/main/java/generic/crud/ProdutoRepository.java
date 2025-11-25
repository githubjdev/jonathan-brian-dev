package generic.crud;

public class ProdutoRepository extends InMemoryCrudRepository<Produto, Long> {

	@Override
	protected Long getId(Produto entity) {
		return entity.getId();
	}

}
