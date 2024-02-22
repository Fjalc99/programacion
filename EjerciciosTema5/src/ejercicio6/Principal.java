package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Trabajador> lista = new ArrayList <>();
		
		
		lista.add(new Trabajador ("Fran","26587413F",40,1500.0));
		lista.add(new Trabajador ("Marisa","29887413F",26,1500.0));
		lista.add(new Trabajadores ("Candi","26127413F",33,1500.0));
		lista.add(new Trabajadores ("Carlos","23487413F",50,1500.0));
		
		System.out.println("-------------------Ordenar por horas trabajadas de mayor a menor-------------------");
		Collections.sort(lista);
		for (Trabajadores t : lista) {
			System.out.println(t);
		}
		
		
	}

}
