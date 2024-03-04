package ejercicioTipoExamen2;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator <Trastero> {
	
	public int compare (Trastero t1, Trastero t2) {
		
		if (t1.getPrecio() > t2.getPrecio()) {
			return -1;
		}else {
			if(t1.getPrecio() < t2.getPrecio()) {
				return 1;
			}
		}
		return 0;
	}
	

}
