package examentipoA;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, metrosCuadrados, estado, idLeido, id;
		String direccion;
		double precioVenta, ganancia=0;
		int tam=0, tam2=10;
		Piso p;
		
		Piso [] lista=new Piso[tam2];
		
		lista[0] = new Piso("a",1,1,1.0,4);
		Inmobiliaria t=new Inmobiliaria(tam, lista, 3); 
		id=4;
		
		do{
			
			System.out.println("Bienvenido al programa");
			System.out.println("Pulse 1 para agregar un piso");
			System.out.println("Pulse 2 para mostrar la lista");
			System.out.println("Pulse 3 para buscar piso");
			System.out.println("Pulse 4 para ver estado del piso");
			System.out.println("Pulse 5 para calcular el precio por metro cuadrados");
			System.out.println("Pulse 0 para salir del programa");
			op=Leer.datoInt();
			
			switch(op) {
			
			case 0: 
				System.out.println("Has salido del programa");
				break;
			
			case 1:
				
				System.out.println("Introduzca la dirección");
				direccion=Leer.dato();
				System.out.println("Introduzca los metros cuadrados");
				metrosCuadrados=Leer.datoInt();
				System.out.println("Introduzca el numero para saber estado del piso, 1 nuevo, 2 seminuevo, 3 reformar");
				estado=Leer.datoInt();
				System.out.println("Introduzca el precio de venta");
				precioVenta=Leer.datoDouble();
				
				p=new Piso(direccion, metrosCuadrados, estado,precioVenta, id);
				id++;
				t.agregarPisos(p);
				break;
				
			case 2:
					t.mostrarPisos(lista);
					break;
				
				
		
			case 3: 
				System.out.println("Diga el id");
				idLeido=Leer.datoInt();
				p=t.buscarByIdV2(idLeido);
			
				if(p==null)
				{
					System.out.println("Producto no encontrado");
				}else {
					System.out.println(p);
				}
				System.out.println(t.buscarByIdV2(idLeido));
				
				break;
			
			case 4:
				System.out.println("Diga sección a ver");
				estado=Leer.datoInt();
				t.mostrarPisos(t.buscarByEstado(estado));
				
				break;
				
				
			case 5:
				
				
				System.out.println("Diga el id del producto que quiere modificar");
				idLeido=Leer.datoInt();
				System.out.println("Diga el porcentaje de ganancia");
				ganancia=Leer.datoDouble();
				System.out.printf("El precio de venta es: %.2f \n", t.calcularMetrosCuadrados(ganancia, idLeido));
				
				break;
				
			}
			
			
			
			
		}while(op != 0);
		
		
	}

}
