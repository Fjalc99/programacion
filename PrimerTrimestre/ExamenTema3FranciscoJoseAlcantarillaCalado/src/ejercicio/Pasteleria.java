package ejercicio;

import java.util.Arrays;

public class Pasteleria {

	private Magdalena[] listado;
	private String nombrePasteleria;
	private int nunMagdalenas;

	public Pasteleria(Magdalena[] listado, String nombrePasteleria, int nunMagdalenas) {
		super();
		this.listado = listado;
		this.nombrePasteleria = nombrePasteleria;
		this.nunMagdalenas = nunMagdalenas;
	}

	public Magdalena[] getListado() {
		return listado;
	}

	public void setListado(Magdalena[] listado) {
		this.listado = listado;
	}

	public String getNombrePasteleria() {
		return nombrePasteleria;
	}

	public void setNombrePasteleria(String nombrePasteleria) {
		this.nombrePasteleria = nombrePasteleria;
	}

	public int getNunMagdalenas() {
		return nunMagdalenas;
	}

	public void setNunMagdalenas(int nunMagdalenas) {
		this.nunMagdalenas = nunMagdalenas;
	}

	@Override
	public String toString() {
		return "Pasteleria [listado=" + Arrays.toString(listado) + ", nombrePasteleria=" + nombrePasteleria
				+ ", nunMagdalenas=" + nunMagdalenas + "]";
	}

	public double calcularPrecioCoste(double precio, Magdalena m) {

		return m.getVolumenMasa() * precio;

	}

	public double calcularExtra(double extra, Magdalena m, double precio) {

		int cien = 100;
		if (m.isNormal()) {

			return -1;
		}

		return calcularPrecioCoste(precio, m) + calcularPrecioCoste(precio, m) * extra / cien;
	}
	
	public double calcularPvp(Magdalena m, double pvp, double precio){
		
		int cien=100;
		return  calcularPrecioCoste(precio, m) + calcularPrecioCoste(precio, m) * pvp/cien;
		
	}

	public Magdalena buscarPorId(int id) {

		for (int i = 0; i < listado.length; i++) {
			if (listado[i].getId() == id) {
				return listado[i];
			}
		}
		return null;
	}

	public Magdalena[] buscarPorSabor(String sabor) {

		Magdalena[] listaAux = new Magdalena[listado.length];

		for (int i = 0; i < nunMagdalenas; i++) {
			if (listado[i].getSabor().equalsIgnoreCase(sabor)) {
				listaAux[i] = listado[i];
			}
		}
		return listaAux;
	}
	
	

	public void mostrarSabores(Magdalena[] listado) {
		for (int i = 0; i < nunMagdalenas; i++) {
			if (listado[i] != null) {
				System.out.println(listado[i]);
			}
		}
	}

	public void mostrarLista() {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
		}
	}

	public double  calcularPrecioCosteTotal(double precio, Magdalena [] listado) {
		
		double total=0;
		for (int i = 0; i < nunMagdalenas; i++) {
		
			total= precio * listado[i].getVolumenMasa();
			
		}
		
		return total;
	}
	
}
