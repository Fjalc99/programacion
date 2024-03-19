package ejemploFechas;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha;
		GestionReserva g = new GestionReserva();
		
		System.out.println("Introduzca fecha");
		fecha=Leer.dato();
		
		g.comprobarReserva(fecha);
		
		
		
	}

}
