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
		
		int op=0, lecturaVenta = 0;
		
		String nombre;
		double precioFabrica;
		int seccion;
		boolean enVenta;
		int tam=0, tam2=10;
		
		Producto p;
		//Productos de prueba
		
		
		
		Producto [] lista=new Producto [tam2];
		Tienda t=new Tienda(lista, tam, 3);
		
		
		do {
		System.out.println("Hola, gestionamos productos");
		System.out.println("Pulse 1 para agregar un nuevo producto");
		System.out.println("Pulse 2 para mostrar lista");
		System.out.println("Pulse 3 para buscar por seccion");
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
							
							p=new Producto(nombre, precioFabrica, seccion, enVenta);
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
			
			
			
			}
			
			
			
		}while(op != 0);
		
		
		
		
		
		
		
		
	}
	}
