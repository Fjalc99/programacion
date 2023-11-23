package pasoporrefencia;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int diaAct, mesAct;
			Fecha nacimiento = new Fecha(8, 07, 1976 );
			Fecha contratacion = new Fecha(17, 10, 2004 );
			Empleado empleado = new Empleado("Ángel", "Naranjo", nacimiento,
			contratacion);
			System.out.println(empleado);
			System.out.println("Qué día es hoy");
			diaAct=Leer.datoInt();
			System.out.println("¿Qué mes?");
			mesAct=Leer.datoInt();
			Fecha actual= new Fecha (diaAct, mesAct);
			empleado.felicitarCumple(actual);
			System.out.println(empleado);
			System.out.println("****************");
			empleado.rejuvenecer(nacimiento);
			System.out.println(empleado);

	}

}
