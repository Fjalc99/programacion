package ejemploMap2;


import java.util.HashMap;
import java.util.Map;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map <Integer, Alumno> lista2 = new HashMap <>();
		Alumno a = new Alumno (1,3.2,"Fran");
		
		
		lista2.put(6, new Alumno(1,3.2,"Fran"));
		lista2.put(6, a);
		//Sobrescribe la asignación anterior porque no admite claves repetidas
		//Devuelve el conjunto de las claves y se guarda en set1
		System.out.println(lista2);
		a.setNombre("rafa");
		System.out.println(lista2);
		
		
		
	}

}
