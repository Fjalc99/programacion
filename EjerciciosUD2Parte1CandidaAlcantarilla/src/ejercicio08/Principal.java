package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que simule un inicio de sesión leyendo por teclado el nombre del
		 usuario y la contraseña y comprobando si esos coinciden con unos guardados en unas
		 variables inicializadas por vosotros al comienzo del programa.*/
		
		String contrasenaPropia="Candi", usuarioPropio="Candi", usuario, contrasena;
		
		System.out.println(".......................");
		System.out.println("BIENVENIDOS AL PROGRAMA");
		System.out.println(".......................");
		
		System.out.println("Vamos a entrar en nuestra cuenta de Gmail");
		System.out.println("Introduzca su usuario");
		usuario=Leer.dato();
		System.out.println("Introduzca la contraseña");
		contrasena=Leer.dato();
		
		if(usuarioPropio.equals(usuario) && contrasenaPropia.equals(contrasena)) {
			System.out.println("Has conseguido iniciar sesión");
		}else {
			System.out.println("No es posible entrar");
		}
		
		System.out.println("............................");
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
		System.out.println("............................");
		
	}

}
