package generic.crud;

public class VeiculoRepository extends InMemoryCrudRepository<Veiculo, Long> {

	@Override
	protected Long getId(Veiculo entity) {
		return entity.getId();
	}

}
