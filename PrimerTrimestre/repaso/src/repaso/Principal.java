package repaso;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*double precioFabrica;
		Producto p, p3;
		System.out.println("Diga precio");
		precioFabrica=Leer.datoDouble();
		
		 p=new Producto ("Tomate", 1.2, 1, true);
		System.out.println(p.getPrecioFabrica());
		System.out.println(precioFabrica);
		
		//Cuando vayamos a instanciar un objeto no lo hacemos vacio y lo llamamos al set
		p3=new Producto();
		p3.setPrecioFabrica(precioFabrica);
		
		//El tostring hace que podamos imprimir el atributo que esta en el , si lo pedimos sin el toString imprimiria el espacio de memoria
		System.out.println(p);*/
		
		int op=0, lecturaVenta = 0, id = 0, idLeido;
		
		String nombre;
		double precioFabrica, ganancia=0, nuevoPrecio=0, descuento=0;
		int seccion;
		boolean enVenta;
		int tam=0, tam2=10;
		
		
		Producto p;
		//Productos de prueba
		
		
		
		Producto [] lista=new Producto [tam2];
		Tienda t=new Tienda(lista, tam, 3);
		id=4;
		
		
		do {
		System.out.println("Hola, gestionamos productos");
		System.out.println("Pulse 1 para agregar un nuevo producto");
		System.out.println("Pulse 2 para mostrar lista");
		System.out.println("Pulse 3 para buscar por seccion");
		System.out.println("Pulse 4 para buscar por Id");
		System.out.println("Pulse 5 para calcular el PVP");
		System.out.println("Pulse 6 para modificar precios de fabrica de una seccion");
		System.out.println("Pulse 7 para calcular descuento");
		System.out.println("Pulse 8 para borrar seccion");
		System.out.println("Pulsa 9 para mostrar productos activos");
		System.out.println("Pulse 0 para salir ");
		op=Leer.datoInt();
		
		
			switch(op) {
						case 0:
							System.out.println("Ha decidido salir");
							break;
				
						case 1:
							System.out.println("Diga el nombre del producto");
							nombre=Leer.dato();
							System.out.println("Diga el precio de fabrica");
							precioFabrica=Leer.datoDouble();
							System.out.println("Diga la seccion del producto: "+ "1 alimentacion, 2 electronica, 3 ropa");
							seccion=Leer.datoInt();
							
							System.out.println("Diga si está en venta: 1 sí, cualquier otro para no");
							lecturaVenta=Leer.datoInt();
							if(lecturaVenta == 1) {
								enVenta=true;
							}else {
								enVenta=false;
							}
							
							//Dos formas
							//a) Creando el producto antes
							
							p=new Producto(nombre, precioFabrica, seccion, enVenta, id);
							id++;
							t.agregar(p);
							
							//b) Instanciando directamente el producto
							//t.agregar(new Producto (nombre, precioFabrica, seccion, enVenta));
							break;
						
						case 2: 
								t.mostrarProductos();
							
							break;
							
						case 3:
							System.out.println("Diga sección a ver");
							seccion=Leer.datoInt();
							t.mostrarLista(t.buscarBySeccion(seccion));
							
							break;
							
						case 4:
							
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
							
							
						case 5:
							System.out.println("Diga el id del producto que quiere modificar");
							idLeido=Leer.datoInt();
							System.out.println("Diga el porcentaje de ganancia");
							ganancia=Leer.datoDouble();
							System.out.printf("El precio de venta es: %.2f \n", t.calcularPreciofinal(ganancia, idLeido));
							
							break;
							
						case 6:
							System.out.println("Diga sección a modificar");
							seccion=Leer.datoInt();
							
							System.out.println("Diga nuevo precio");
							nuevoPrecio=Leer.datoDouble();
							t.modificarPrecioSeccion(nuevoPrecio, seccion);
							break;
							
							
						case 7:
							 System.out.println("Diga el descuento");
							 descuento=Leer.datoDouble();
							 System.out.println("Diga la ganancia");
							 ganancia=Leer.datoDouble();
							 System.out.println("Diga el id del producto a modificar");
							 idLeido=Leer.datoInt();
							 System.out.printf("El precio con descuento"+ "es: %.2f euros\n\n", t.hacerDescuento(descuento, ganancia, idLeido));
							 
							 break;
							 
						case 8: 
								
							System.out.println("Diga qué sección quiere eliminar");
							seccion=Leer.datoInt();
							System.out.println("Se han eliminado" + t.eliminarSeccion(seccion) + "Productos");
							break;
							
						case 9:
							t.mostrarProductosActivos(); 
							break;
							
			
			}
			
			
			
		}while(op != 0);
		
		
		
		
		
		
		
		
	}
	}
