package segundoEjemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Persona> lista  = new ArrayList <Persona> ();
		
		
		Persona p = new Persona (34, "Fran");
		Persona p1 = new Persona (26, "Marissa");
		Persona p2 = new Persona (18, "Candi");
		
	
		lista.add(p);
		lista.add(p1);
		lista.add(p2);
	
		System.out.println(lista.isEmpty());
		System.out.println(lista);
		System.out.println(lista.remove(p));
		System.out.println(lista);
		System.out.println(lista.contains(p1));
		
		
		
	}

}
