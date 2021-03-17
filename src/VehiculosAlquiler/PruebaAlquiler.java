package VehiculosAlquiler;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlquiler {
	
	static ArrayList <Alquiler> alquileres = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		//Se pida que se pida por teclado los dias a alquilar los vehiculos y todos van a ser los mismo dias
		//por eso lo pongo asi
		System.out.println("¿Cuantos dias vas alquilar los vehiculos?");
		int diasDeAlquiler = s.nextInt();
		
		Coche uno = new Coche("1234XCW", 2, diasDeAlquiler);
		MicroBus dos = new MicroBus("4321XWT", 50, diasDeAlquiler);
		Furgoneta tres = new Furgoneta("5555DVW", 5, diasDeAlquiler);
		Camion cuatro = new Camion("6669SSS", 20, diasDeAlquiler);
		
		
		alquileres.add(uno);
		alquileres.add(dos);
		alquileres.add(tres);
		alquileres.add(cuatro);
		
		//como se accedia a los elementos del interface¿?¿?¿?¿   :WWWWWW
		
		for (Alquiler x : alquileres) {
			
			System.out.println(x.toString());
			
		}
		
//		System.out.println(uno);
//		System.out.println(dos);
//		System.out.println(tres);
//		System.out.println(cuatro);
//	
		s.close();
	}
	

}
