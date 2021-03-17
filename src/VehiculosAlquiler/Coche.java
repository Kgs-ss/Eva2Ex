package VehiculosAlquiler;

public class Coche extends Vehiculo {
	
	private double precioTotal;
	private int plazas;
	private int dias;
	private int precioDia;
	
	public Coche(String matricula,  int plazas, int dias) {
		super(matricula);
		this.plazas = plazas;
		this.dias = dias;
		this.precioDia = 50;
		this.precioTotal = precioTotalDia(plazas, dias);
		
	}
	
	
	
	public double getPrecioDia() {
		return precioTotal;
	}



	public void setPrecioDia(double precioDia) {
		this.precioTotal = precioDia;
	}



	public int getPlazas() {
		return plazas;
	}



	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	


	public int getDias() {
		return dias;
	}



	public void setDias(int dias) {
		this.dias = dias;
	}



	public double precioTotalDia(int plazas, int dias) {
		
		
		precioTotal = (this.precioDia + (plazas * 1.5)) * dias;

		return precioTotal;
	}



	@Override
	public String toString() {
		return "Coche precioDia=" + precioTotal + " €, plazas=" + plazas ;
	}
	
	public static void main (String [] args) {
		
		Coche prueba = new Coche("1234XCW", 2, 4);
		System.out.println(prueba);
		System.out.println(prueba.getPrecioDia());
	}

}


