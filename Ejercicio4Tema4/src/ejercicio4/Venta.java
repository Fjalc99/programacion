package ejercicio4;

import java.util.Arrays;

public class Venta {

	
	private LineaDeVenta [] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularPrecioTotal() {
		
		double total=0.0;
		
		for (int i = 0; i < lista.length; i++) {
			total = total + lista[i].calcularPrecioLineaVenta();}
	
		return total;
	}
	
	public void mostrarTicket() {
        System.out.println("*************************Tiendecita*************************\n");
        System.out.println("Producto\tPrecio Ud.\tCant.\t\tSubTotal");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i].getP().getNombre());
            System.out.print("\t\t"+lista[i].getP().calcularPrecioUnitario());
            System.out.print("\t\t"+lista[i].getCantProductos());
            System.out.println("\t\t"+lista[i].calcularPrecioLineaVenta());
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total compra: "+this.calcularPrecioTotal());
    }	
	public void mostrarProductosGuardados () {
		for (int j = 0; j < lista.length; j++) {
			System.out.println(lista[j].getP().getNombre());
			if (lista[j].getP() instanceof Alimentacion) {
				((Alimentacion)lista[j].getP()).mostrarSiCaducaEn2Dias();
			}
		}
		
	}
	
}
