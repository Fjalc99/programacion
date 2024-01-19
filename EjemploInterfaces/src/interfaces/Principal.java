package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal a = new Animal ("Programador",2);
		Persona p = new Persona("Luismi", 34);
		
		a.cazar(a);
		a.huir();
		p.cazar(a);
		
	}

}
