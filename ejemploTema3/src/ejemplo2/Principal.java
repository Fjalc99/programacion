package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		double notaPro;
		double notaBD;
		Alumno a;
		double media;
		
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		
		System.out.println("Diga su nota de programación");
		notaPro=Leer.datoDouble();
		
		System.out.println("Diga su nota de Base de datos");
		notaBD=Leer.datoDouble();
		
		
		a=new Alumno (nombre, notaPro, notaBD);
		
		media=a.calcularMedia();
		a.mostrarMedia(media);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
