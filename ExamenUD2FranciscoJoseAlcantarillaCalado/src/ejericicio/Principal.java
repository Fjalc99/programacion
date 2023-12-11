package ejericicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, pagas = 14, cien = 100;
		double sueldoBruto, horExtrTrabajadas, porcentajeImpuestos, precHorExtra, totalNeto = 0, sueldoNeto = 0;
		double totSuelBruto, totImpuestos, impuestoIrpb, precCoche ;
		
		
		System.out.println("Bienvenido al programa");
		System.out.println("--------------------------------------------");
		System.out.println("Introduzca el sueldo bruto");
		sueldoBruto=Leer.datoDouble();
		System.out.println("--------------------------------------------");
		System.out.println("Introduzca horas extras trabajadas");
		horExtrTrabajadas=Leer.datoDouble();
		System.out.println("--------------------------------------------");
		System.out.println("Introduzca el porcentaje de impuestos");
		porcentajeImpuestos=Leer.datoDouble();
		System.out.println("--------------------------------------------");
		System.out.println("Introduzca el precio de las horas extras");
		precHorExtra=Leer.datoDouble();
		System.out.println("--------------------------------------------");
		do {
			
			
			System.out.println("Pulse 1 para calcular sueldo sin impuestos");
			System.out.println("Pulse 2 para calcular impuestos");
			System.out.println("Pulse 3 para calcular el sueldo neto");
			System.out.println("Pulsa 4 para calcular el total neto");
			System.out.println("Pulsa 5 para comprar un coche");
			System.out.println("Pulsa 0 para salir del programa");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				case 1:
					totSuelBruto = sueldoBruto + (horExtrTrabajadas * precHorExtra);
					System.out.println("El sueldo sin impuestos es de "+totSuelBruto + "€");
					System.out.println("");
					break;
					
				case 2:
					totImpuestos = sueldoBruto - (sueldoBruto * (porcentajeImpuestos / cien));
					System.out.println("El sueldo bruto con impuestos es de "+totImpuestos + "€");
					System.out.println("");
					break;
					
				case 3:
					System.out.println("Introduzca el impuesto IRPB");
					impuestoIrpb=Leer.datoDouble();
					
					sueldoNeto = (sueldoBruto +(horExtrTrabajadas * precHorExtra) - 
					(sueldoBruto * (porcentajeImpuestos /cien)) - (sueldoBruto * (impuestoIrpb / cien))); 
					
					System.out.println("Su sueldo total neto es de "+sueldoNeto + "€" );
					System.out.println("");
					break;
					
				case 4:
					totalNeto = sueldoNeto * pagas;
					System.out.println("Su sueldo total neto al año es de "+totalNeto +"€");
					System.out.println("");
					break;
					
				case 5:
					System.out.println("Introduzca el precio del coche");
					precCoche=Leer.datoDouble();
					if(precCoche < totalNeto) {
						
						
						System.out.println("No se puede comprar el coche");
						System.out.println("");
						
						
					}else {
						System.out.println("Se puede comprar el coche");
						System.out.println("");
					}
					break;
				
				case 0:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
			
		}while(opcion !=0);
		System.out.println("--------------------------------------------");
		System.out.println("Gracias por usar el programa");
		System.out.println("--------------------------------------------");
	}

}
