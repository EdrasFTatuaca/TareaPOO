package Carrera_Autos_POO;
import java.util.*;
public class Carrera_Autos {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	List<vueltas> promedio_velocidad = new ArrayList<>();
	
	int vueltas, carros;
	float promedio, velocidad; 
	
	
	System.out.println("GRAN COMPETENCIA DE AUTOS");
	System.out.println("--Registro de autos--");
	System.out.println("Ingrese la cantidad de autos");
	carros = scanner.nextInt();
	
	for (int i = 0;i<carros;i++);
			System.out.println("Ingrese la cantidad de vueltas del carro ");
			vueltas=scanner.nextInt();
			
			for (int a=0; a >=vueltas; a++) {
				System.out.println("Ingrese la velocidad de la vuelta en KM/H ");
				velocidad = scanner.nextFloat();
				
				promedio = velocidad/vueltas;
				
				System.out.println("El promedio de velocidad de auto "+carros+" es de "+promedio);
				
			
		}
	}
}