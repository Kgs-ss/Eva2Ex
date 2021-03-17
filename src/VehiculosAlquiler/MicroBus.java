package VehiculosAlquiler;

public class MicroBus extends Vehiculo {
	
	
	
	private double precioTotal;
	private int plazas;
	private int dias;
	private int precioDia;
	
	public MicroBus(String matricula,  int plazas, int dias) {
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


	//tiene 50 € el dia de base pero se le aumenta  menos que el coche, pues el coche son
	//50 € dia y el microbus son 50 total  + (plazas + dias) * 2
	public double precioTotalDia(int plazas, int dias) {
		
		
		precioTotal = ((this.precioDia + ((plazas + dias) *  2)));

		return precioTotal;
	}



	@Override
	public String toString() {
		return "Coche precioDia=" + precioTotal + ", plazas=" + plazas ;
	}
	
	public static void main (String [] args) {
		
		MicroBus prueba = new MicroBus("1234XCW", 50, 3);
		System.out.println(prueba.getPrecioDia());
	}

}
