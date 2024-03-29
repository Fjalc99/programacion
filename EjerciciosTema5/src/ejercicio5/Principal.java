package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Persona> personas =new ArrayList<Persona>();
		
		personas.add(new Persona("Fran","1245789F",24));
		personas.add(new Persona("Marisa","1895789G",19));
		personas.add(new Persona("Candi","1234789T",22));
		personas.add(new Persona("Carlos","1125789Y",18));
		personas.add(new Persona("Luis","1675789L",30));
		System.out.println("-----------------------------------------------");
		System.out.println("Sin ordenar");
		System.out.println("-----------------------------------------------");
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Ordenar por edad");
		System.out.println("-----------------------------------------------");
		Collections.sort(personas);
		for (Persona p : personas) {
			System.out.println(p);
		}	
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Ordenar por nombre");
		System.out.println("-----------------------------------------------");
		
		Collections.sort(personas, new CompararPorNombre());
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		
	}

}
