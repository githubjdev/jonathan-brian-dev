package generic.listautil;

import java.util.Arrays;

public class ListaTeste {
	
	public static void main(String[] args) {
		String ultimoString = new ListaUtils().ultimo(Arrays.asList("A","B","C"));
		System.out.println("Ultimo elemento: " + ultimoString);
		
		
		String primiro = new ListaUtils().primeiro(Arrays.asList("A","B","C"));
		
		System.out.println("Primeiro elemento: " + primiro);
	}

}
