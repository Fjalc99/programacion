package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*3. Leer un número y mostrar por la salida estándar si dicho número es o no par.*/
		
		int num1=0, cero=0, dos=2;
		
		System.out.println("Bienvenidos al programa");
		System.out.println("########################");
		
		System.out.println("Introduzca el numero");
		num1=Leer.datoInt();
		System.out.println("########################");
		
			if(  num1 % dos == cero) {
					System.out.println("El numero es par");	
				}else {
					System.out.println("El numero es impar");
		}	
	
	}

}
