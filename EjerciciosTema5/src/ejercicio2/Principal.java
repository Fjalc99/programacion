package ejercicio2;

import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2) Crear un programa para gestionar los socios de un Club de campo. Se debe poder guardar Socios con
sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos (operaciones CRUD). Usar
la clase ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc*/
		
		List <Socio> lista = new ArrayList <> ();
		
		
		
		Socio  s = new Socio ("Fran",24,"123F",1.20);
		CrudSocio cs= new CrudSocio(lista);
		
		cs.agregarSocio(s);
		System.out.println(lista);
		cs.borrarSocio("123F");
		System.out.println(lista);
		
		
		
		
	}

}
