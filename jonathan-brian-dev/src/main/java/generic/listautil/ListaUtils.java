package generic.listautil;

import java.util.List;

public class ListaUtils {

	public <T> T ultimo(List<T> lista) {
		
		if (lista.isEmpty()) {
			return null;
		}

		return lista.get(lista.size() - 1);
	}
	
	
	public <T> T primeiro(List<T> lista) {
		
		if (lista.isEmpty()) {
			return null;
		}

		return lista.get(0);
	}


}
