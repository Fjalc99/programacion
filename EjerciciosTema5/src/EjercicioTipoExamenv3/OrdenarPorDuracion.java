package EjercicioTipoExamenv3;

import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator <Cancion> {

	public int compare (Cancion c1, Cancion c2) {
		
		if (c1.getDuracion() > c2.getDuracion()) {
			return 1;
		}else {
			if (c1.getDuracion()< c2.getDuracion()) {
				return -1;
			}
		}
		
			return 0;
	}
	
}
