package ejercicio4;

public class LineaDeVenta {

	
	private Producto p;
	private int cantProductos;
	
	public LineaDeVenta(Producto p, int cantProductos) {
		super();
		this.p = p;
		this.cantProductos = cantProductos;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantProductos() {
		return cantProductos;
	}

	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantProductos=" + cantProductos + "]";
	}
	
	public double calcularPrecioLineaVenta () {
		
		return p.calcularPrecioUnitario() * cantProductos;
	}
	/* Este es para cuando no tenemos el atributo producto

public double calcularPrecioDeUno (Producto p){
		return p.calcularPrecioUnitario();
	}
	
public double calcularPrecioLineaVentaV2 (Producto p) {
		
		return p.calcularPrecioUnitario() * cantProductos;
	}
	
	*/
}
