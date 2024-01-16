package ejemploPolimorfismo;

public class OperacionesFiguras {

	
	//Este metodo lo vamos a tener siempre 
	public double calcularElAreaDeUnaFigura (Figura f){
		return f.calcularArea();
		}
	
	public double sumarAreas (Figura [] listado) {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularElAreaDeUnaFigura(listado[i]);
			//resultado = resultado + listado[i].calcularArea();              //Este no se usa porque quita puntos y es mejor el de arriba
		}
		return resultado;
	}
	
	
	
	public double sumarAreasConAviso (Figura [] listado) {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularElAreaDeUnaFigura(listado[i]);
			if(listado[i] instanceof Circulo) {
			((Circulo) listado[i]).mostrarRadianes();
			}
		}
		return resultado;
	}
	
}
