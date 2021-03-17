package VehiculosAlquiler;

public class Furgoneta extends Vehiculo {

	private double precioTotal;
	private double pesoToneladas;
	private int dias;
	private int precioDia;
	
	public Furgoneta(String matricula, double peso, int dias) {
		super(matricula);
		this.pesoToneladas = peso;
		this.dias = dias;
		this.precioDia = 50;
		this.precioTotal = precioTotalDia(peso, dias );
		
	}
	
	


	public double getPrecioTotal() {
		return precioTotal;
	}





	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}





	public double getPesoToneladas() {
		return pesoToneladas;
	}





	public void setPesoToneladas(double pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}





	public int getDias() {
		return dias;
	}





	public void setDias(int dias) {
		this.dias = dias;
	}





	public double precioTotalDia(double peso, int dias) {
		
		precioTotal = (this.precioDia +  (20 * peso)) * dias;

		return precioTotal;
	}



	@Override
	public String toString() {
		return "Furgoneta peso=" + pesoToneladas + ", dias=" + dias + ", precio=" + precioTotal;
	}




	@Override
	public void precioAPagar() {
		System.out.println(getPrecioTotal());
		
	}
	
	
	
	
}
