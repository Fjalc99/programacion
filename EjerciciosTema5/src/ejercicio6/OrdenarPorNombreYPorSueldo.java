package ejercicio6;

import java.util.Comparator;

public class OrdenarPorNombreYPorSueldo implements Comparator <Trabajador> {

	
	public int compare (Trabajador t1, Trabajador t2) {
		
		OrdenarSueldoFinal osf = new OrdenarSueldoFinal();
		
		
		if(t1.getHorasTrabajadas() > t2.getHorasTrabajadas()) {
			return 1;
		}else {
			if(t1.getHorasTrabajadas()<t2.getHorasTrabajadas()) {
				return -1;
			}
		}
		
		return osf.compare(t1, t2);
	}
	
	

	
	
}
