package ejemploFechas;

import java.time.LocalDate;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) throws fechaIncorrecta {
		// TODO Auto-generated method stub

		String fecha;
		boolean salida = false;
		GestionReserva g = new GestionReserva();
		LocalDate fechaReserva = LocalDate.of(2024, 03, 19);
			
		try {
			
			do {
					
				System.out.println("Introduzca fecha, (año-mes-día)");
				fecha=Leer.dato();
				fechaReserva = LocalDate.parse(fecha);
				
				
				
				g.comprobarReserva(fechaReserva);
				
				System.out.println("La fecha de reserva es de "+fechaReserva);
				salida=true;
				
				
				
				
			}while(!salida);
	
			
		}catch(fechaIncorrecta e) {
			System.out.println(e.getMessage());
			
		}catch(RuntimeException e) {
			System.out.println("Introduzca fecha valida");
		}
		
		
		
		
	}

}
