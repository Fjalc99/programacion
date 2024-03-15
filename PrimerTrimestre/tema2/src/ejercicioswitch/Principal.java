package ejercicioswitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*10. Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada
una. Se debe leer la sala deseada y mostrar:
a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,
sala vip, sala 3D, sala normal y sala para niños).
b. Pedir el número de entradas.
c. Calcular el precio final y mostrarlo.*/
		
		int sala, entradas, precio;
		int precioVip=10, precio3d=8, precioNormal=5, precioNiños=2;
		System.out.println("Bienvenidos al cine a que sala desea ir");
		System.out.println("Pulse 1 para ir a sala vip:Avatar");
		System.out.println("Pulse 2 para ir a sala 3D:Megalodón 2");
		System.out.println("Pulse 3 para ir a sala normal:Deadpool 3");
		System.out.println("Pulse 4 para ir a sala niños:Tadeo jones 3");
		sala=Leer.datoInt();
		
		switch (sala) {
		case 1:
			System.out.println("Has seleccionado la sala vip el precio de la entrada es 10€, cuantas entradas quieres comprar");
			entradas=Leer.datoInt();
			precio=entradas*precioVip;
			System.out.println("El precio total de las entradas es de "+precio);
			break;
			
		case 2:
			System.out.println("Has seleccionado la sala 3D el precio de la entrada es de 8€, cuantas entradas quieres comprar");
			entradas=Leer.datoInt();
			precio=entradas*precio3d;
			System.out.println("El precio total de las entradas es de "+precio);
			break;
			
		case 3: 
			System.out.println("Has seleccionado la sala normal el precio de la entrada es de 5€, cuantas entradas quieres comprar");
			entradas=Leer.datoInt();
			precio=entradas*precioNormal;
			System.out.println("El precio total de las entradas es de "+precio);
			break;
			
		case 4: 
			System.out.println("Has seleccionado la sala niños el precio de la entrada es de 2€, cuantas entradas quieres comprar");
			entradas=Leer.datoInt();
			precio=entradas*precioNiños;
			System.out.println("El precio total de las entradas es de "+precio);
			break;
			
		default:
			System.out.println("Opción no valida");
			
	}
		System.out.println("Gracias por usar el programa");
}
}
