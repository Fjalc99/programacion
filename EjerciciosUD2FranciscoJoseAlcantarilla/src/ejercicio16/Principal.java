package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*16. Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
que le corresponde.*/
		
		double suel1 = 16.00,total = 0;
		int horas, cuarenta = 40, horasExtra = 0, extra = 20;
		
		
		System.out.println("Bienvenidos al programa");
		
		System.out.println("Introduzca el número de horas trabajadas");
		horas=Leer.datoInt();
		
		if (horas <= cuarenta) {
			total = horas * suel1;
			System.out.println("El sueldo total es de "+total + "€");
			
		}else {
			if (horas > cuarenta) {
				horasExtra = (horas - cuarenta) * extra;
				total = horas * suel1 + horasExtra;
				System.out.println("El sueldo total con las horas extras es de "+total + "€");
				
			}
		}
		
		
		
		
	}
  }

