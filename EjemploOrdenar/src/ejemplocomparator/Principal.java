package ejemplocomparator;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Realmente esta lista tendria que estar en la clase carrera
		
		int opcionUser, pos=0;
		
		List<Corredor> corredores =new ArrayList<Corredor>();
		
		corredores.add(new Corredor(4,1.43,"Jesse Owens"));
		corredores.add(new Corredor(8,1.11,"Ángel Naranjo"));
		corredores.add(new Corredor(3,2.23,"Abel Antón"));
		corredores.add(new Corredor(5,1.12,"Luis Miguel López"));
	
		do {
				System.out.println("Bienvenido al programa");
				opcionUser=Leer.datoInt();
				
				switch(opcionUser) {
				
				
				
				}
			
		} while (opcionUser !=0);
		
	}

}
