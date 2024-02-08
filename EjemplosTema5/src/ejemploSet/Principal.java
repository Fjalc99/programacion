package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Persona> lista = new HashSet <>();
		
	/*	lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		lista.remove("Tres");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("UNO"));
		System.out.println(lista.contains("Uno")); */
		
		//Con lista de personas
		
		lista.add(new Persona ("Fran",24,"1234a"));
		lista.add(new Persona ("Candi",21,"1734s"));
		lista.add(new Persona ("Luis",34,"1244b"));
		lista.add(new Persona ("Manuel",44,"1134t"));
		
		
		System.out.println(lista);
		
		
		
		
	}

}
