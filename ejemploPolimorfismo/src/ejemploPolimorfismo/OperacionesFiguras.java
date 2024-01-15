package ejemploPolimorfismo;

public class OperacionesFiguras {

	
	//Este metodo lo vamos a tener siempre 
	public double calcularElAreaDeUnaFigura (Figura f){
		return f.calcularArea();
		}
	
	public double sumarAreas (Figura [] listado){
		double resultado=0;
		for (int i=0; i<listado.length;i++){
		resultado=resultado+calcularElAreaDeUnaFigura(listado[i]);
		}
		return resultado;
		}
}
