package VehiculosAlquiler;

public abstract class Vehiculo implements Alquiler{
	
	private String matricula;
	
	
	public Vehiculo (String matricula) {
		
		this.matricula = matricula;
		
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


//	@Override
//	public String toString() {
//		return "matricula=" + matricula;
//	}
//	
	

}
