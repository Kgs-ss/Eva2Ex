package VehiculosAlquiler;

public class Camion extends Vehiculo {

	private double precioTotal;
	private double peso;
	private int dias;
	private int precioDia;
	
	public Camion(String matricula, double peso, int dias) {
		super(matricula);
		this.peso = peso;
		this.dias = dias;
		this.precioDia = 50;
		this.precioTotal = precioTotalDia(peso, dias );
		
	}
	
	
	
	public double getPrecioDia() {
		return precioTotal;
	}



	public void setPrecioDia(double precioDia) {
		this.precioTotal = precioDia;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public int getDias() {
		return dias;
	}



	public void setDias(int dias) {
		this.dias = dias;
	}



	public int getPrecio() {
		return precioDia;
	}



	public void setPrecio(int precio) {
		this.precioDia = precio;
	}


	//el precio tiene un suplemento de 40 euros al dia entiendo
	public double precioTotalDia(double peso, int dias) {
		
		precioTotal = ((this.precioDia + 40) +  (20 * peso)) * dias;

		return precioTotal;
	}



	@Override
	public String toString() {
		return "Camión peso=" + peso + ", dias=" + dias + ", precio=" + precioDia;
	}
	
	
}