package ejemplo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movil m = new Movil ("Samnsung");
		
		List <Movil> lista = new ArrayList <>();
		int e=3, q=5;
		String mensaje;
		String marca = null;
		
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
		
		for (Movil m1 : lista) {
			System.out.println(m1);
		}
		
		
		Consumer <String> mostarMovil = (r) -> System.out.println(m);
		for (Movil movil2 : lista) {
			mostarMovil.accept();
		}
		
		
	}

}
