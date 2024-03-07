package ejemplo;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Localdate
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println(hoy);
		
		
		LocalDate fecha1 = LocalDate.of(1999, 07, 20);
		
		System.out.println(fecha1);
		
		String fechaParse = "1998-04-08";
		
		LocalDate fecha2 = LocalDate.parse(fechaParse);
		
		System.out.println(fecha2);

		System.out.println(fecha1.getDayOfMonth());
		
		
		//-----------------------------------------------------------------
		
		//Localtime
		
		
	
	}

}
