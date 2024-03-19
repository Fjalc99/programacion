package ejemploFechas;

import java.time.LocalDate;


public class GestionReserva {

	public LocalDate comprobarReserva(LocalDate fechaReserva) throws fechaIncorrecta {
		
		if(fechaReserva.isBefore(LocalDate.now())) {
		 	throw new fechaIncorrecta("Fecha incorrecta");
		}else {
			
			return fechaReserva;
		}
		
	}
	

}
