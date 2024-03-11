package ejemplo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int e=3, q=5;
		String mensaje;
		
		
		
		System.out.println("Intoduzca el mensaje");
		mensaje=Leer.dato();
		
		
		
		IBienvenida bienvenida = (x) -> System.out.println(x);
		
		
		bienvenida.mostrarBienvenida(mensaje);
		
		System.out.println("---------------------------------------------------------");
		
		//Lambda con varios parametros
		ISumar sumar1 = (a, b)-> a+b;
		
		System.out.println(sumar1.sumar(e, q));
		
		//Seria una Lambda con un parametro
		/*ISumar restar = z -> z-2;
		System.out.println(restar.sumar(e));*/
		
		
		Supplier <Double> movil = () -> Math.random();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(movil.get());
		}
		
		
		Consumer <String> mostrarmovil = (r) -> System.out.println(r);
		for (int i = 0; i < 6; i++) {
			
			mostrarmovil.accept(mensaje);
			
			Function <Double, Double> aMetros = (km) -> km*1000;
			Function <Double, Double> aCm = (mt) -> mt*100;
			
			
			
			
		}
		
	}

}
