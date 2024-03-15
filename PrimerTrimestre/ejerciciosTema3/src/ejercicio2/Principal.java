package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		double area =0.0;
		Circulo cir;
		
		System.out.println("Vamos a calcular el area de un circulo");
		System.out.println("Diga el radio");
		radio=Leer.datoDouble();
		
		cir=new Circulo (radio);
		
		area=cir.calcularArea();
		
		
		System.out.printf("El area es de %.2f cm cuadrados" , area);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
