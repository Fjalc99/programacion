package ejemplocomparator;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Corredor> {
	


	@Override
	public int compare(Corredor c1, Corredor c2) {
		
		return - (c1.getNombre().toLowerCase().compareTo(c2.getNombre().toLowerCase()));
	}
}
