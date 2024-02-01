package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> lista = new ArrayList <String>();
		lista.add("Fran");
		lista.add("Paco");
		
		
		System.out.println(lista.contains("Fran"));
		System.out.println(lista);
		System.out.println(lista.size());
		lista.remove(0);
		System.out.println(lista);
		System.out.println(lista.size());
		
		
		
	}

}
