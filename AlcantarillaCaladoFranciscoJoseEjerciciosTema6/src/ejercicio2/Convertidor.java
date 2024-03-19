package ejercicio2;

public class Convertidor {

	
	public double convertirCelsius (double grado) throws LimiteGrados {
		
		if(grado <= -273) {
			throw new LimiteGrados("Te has pasado del limite");
		}else {
			return grado * 1.8 + 32;
		}
		
		
		
	}
			
	
	
		
	
	
	
	
	
}
