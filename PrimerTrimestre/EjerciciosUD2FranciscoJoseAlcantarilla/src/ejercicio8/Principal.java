package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*8. Realizar un programa que simule un inicio de sesión leyendo por teclado el nombre del
usuario y la contraseña y comprobando si esos coinciden con unos guardados en unas
variables inicializadas por vosotros al comienzo del programa.*/
		String fran99 = "Fran99";
		String fran = "Fran" ;
		String usuario, contraseña ;
		
		System.out.println("Bienvendido al programa inicie sesion");
		System.out.println("#######################################");
		System.out.println("Introduzca el usuario");
		usuario=Leer.dato();
		System.out.println("#######################################");
		
		System.out.println("Introduzca la contraseña");
		contraseña=Leer.dato();
		System.out.println("#######################################");
		if((usuario.equalsIgnoreCase(fran) && contraseña.equalsIgnoreCase(fran99))) {
			System.out.println("El usuario y la contraseña coinciden");
			
		}else {
			System.out.println("La contraseña o el usuario no coinciden");
		}
	}

}
