package ejemploMap;

import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, String> lista = new HashMap <String, String>();
		Set <String> listaClaves = lista.keySet();
		//Devuelve la vista Colletion de los valores y se guarda en collection
		Collection <String> listaValores = lista.values();
		//Devuelve el conjunto de las asignaciones (clave,valor)

		
		
		
		lista.put("Uno", "One");
		lista.put("Dos", "Two");
		
		System.out.println(lista);
		System.out.println(listaClaves);
		System.out.println(listaValores);
		
		
		
		
	}

}
