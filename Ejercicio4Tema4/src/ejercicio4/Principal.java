package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		 
		Producto p1 = new Alimentacion("Patata", 1, 2.99, 25.0, true);
        Producto p2 = new Electronica("Tablet", 2, 350.0, 12.0);
        Producto p3 = new Alimentacion("Manzana", 3, 1.25, 10.0, false);
        Producto p4 = new Electronica("Movil", 4, 170.50, 15.0);
        Producto p5 = new Alimentacion("Pan", 5, 1.30, 5.0, true);
        
        LineaDeVenta lv1 = new LineaDeVenta(p1, 4);
        LineaDeVenta lv2 = new LineaDeVenta(p2, 1);
        LineaDeVenta lv3 = new LineaDeVenta(p3, 2);
        LineaDeVenta lv4 = new LineaDeVenta(p4, 2);
        LineaDeVenta lv5 = new LineaDeVenta(p5, 7);
        
        LineaDeVenta [] lista = new LineaDeVenta[5];
        lista[0] = lv1;
        lista[1] = lv2;
        lista[2] = lv3;
        lista[3] = lv4;
        lista[4] = lv5;
        
        Venta v = new Venta(lista);
        
        do {
            System.out.println("""
                    
                    1. Mostrar ticket
                    2. Mostrar productos guardados
                    0. Salir
                    """);
            opcion = Leer.datoInt();
            
            switch(opcion) {
            
                case 1:
                    v.mostrarTicket();
                    break;
                    
                case 2:
                    v.mostrarProductosGuardados();
                    break;
                
                case 0:
                    System.out.println("Saliendo...");
                    break;
                
                default:
                    System.out.println("Opción no valida, seleccione de nuevo");
                    break;
                    
            }
            
        } while(opcion != 0);
        System.out.println("Gracias por usar el programa");
    }
	
}
