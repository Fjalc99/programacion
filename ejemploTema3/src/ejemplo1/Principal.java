package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int edad;
		double notaMedia;
		Alumno a1;
		
		//Instanciamos un objeto con valores
		
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga edad");
		edad=Leer.datoInt();
		System.out.println("Diga nota media");
		notaMedia=Leer.datoDouble();
		
		 a1=new Alumno (nombre, edad, notaMedia);
		 a1.mostrarDatos("Condes de bustillo");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
