package ejercicio2;

import java.util.Comparator;
import java.util.List;

import javax.security.auth.callback.TextOutputCallback;

public class GestionCadenas {

	private List <Cadena> listado;

	public GestionCadenas(List<Cadena> listado) {
		super();
		this.listado = listado;
	}

	public List<Cadena> getListado() {
		return listado;
	}

	public void setListado(List<Cadena> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "GestionCadenas [listado=" + listado + "]";
	}
	
	public void addCadena (Cadena c) {
		
		listado.add(c);
	}
	
	
	public List <Cadena> ordenarAlfabeticamente (){
		
		Comparator <Cadena> compararCadena = Comparator.comparing(Cadena::getTexto);
		
		return listado.stream().sorted(compararCadena).toList();
		
	}
	
	public void mostrarLista (List <Cadena> listado) {
		
		listado.stream().forEach(System.out::println);
		
	}
	
	public List <Cadena> buscarCadena (String texto){
		
		return listado.stream()
				.filter(Cadena -> Cadena.getTexto().equalsIgnoreCase(texto))
				.toList();
		
	}
	
	
	
	public List<String> pasarMayus(){
		
		return listado.stream().map(Cadena -> Cadena.getTexto().toUpperCase()).toList();
		
	}
	
}
