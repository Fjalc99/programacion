package ejercicio;

import java.util.Arrays;

public class AeroPuerto {

	private String nombre;
	private Avion[] lista;

	public AeroPuerto(String nombre, Avion[] lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Avion[] getLista() {
		return lista;
	}

	public void setLista(Avion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "AeroPuerto [nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
	}

	public Avion buscarPorId(int id) {

		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			if (lista[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}

		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public double calcularAterrizajeUnAvion(Avion v, double porcentaje, double extraPorMisil) {

		return v.calcularPrecioAterrizaje(porcentaje, extraPorMisil);
	}

	public void mostrarLista() {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);

				if (lista[i] instanceof NavesEspaciales) {
					((NavesEspaciales) lista[i]).avisarExtraterrestres();
				}
			}

		}
	}

	public double calcularTotalRecaudado(double porcentaje, double extraPorMisil) {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				total += lista[i].calcularPrecioAterrizaje(porcentaje, extraPorMisil);
			}
		}

		return total;
	}

	public double calcularTotalRecaudadoCazas(double porcentaje, double extraPorMisil) {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CazasMilitares && lista[i] != null) {
				total += ((CazasMilitares) lista[i]).calcularPrecioAterrizaje(porcentaje, extraPorMisil);
			}
		}

		return total;
	}
}
