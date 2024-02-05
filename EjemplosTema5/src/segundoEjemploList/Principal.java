package segundoEjemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> lista = new ArrayList<Persona>();

		CrudPersona c = new CrudPersona(lista);
		Persona p = new Persona(34, "Fran","14587269L");
		Persona p1 = new Persona(26, "Marissa","458712368F");
		Persona p2 = new Persona(18, "Candi","147852987R");

		lista.add(p);
		lista.add(p);
		lista.add(new Persona(34, "Fran","14587269L"));
		lista.add(new Persona(26, "Marissa","458712368F"));
		lista.add(new Persona(18, "Candi","147852987R"));
		
	
		System.out.println(lista);
		
		c.imprimirLista();
		System.out.println("#################");
		c.borrarPorDni("147852987R");
		c.imprimirLista();

	}

}
