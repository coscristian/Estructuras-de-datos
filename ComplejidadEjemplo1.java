package ejemplo2;

import java.util.Scanner;

public class ComplejidadEjemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long totalTiempo;
		long tiempoInicio;
		long tiempoInicio2;
		
		/*
		for (long i = 0; i < 1000000000; i++) {
			System.out.println("Hola Mundo!");
		}
		*/
		
		int n = sc.nextInt();
		
		// Se toma el tiempo inicial
		tiempoInicio = System.currentTimeMillis();
		tiempoInicio2 = System.nanoTime();
		
		double fact = Factorial.calcularFactorial(n);
		System.out.printf("El factorial de %d es %.2f\n",n, fact);
		
		//Calculo de tiempo empleado
		totalTiempo = System.currentTimeMillis() - tiempoInicio;
		System.out.println("Tiempo demorado:\t" + totalTiempo + " milisegundos.");
		
		totalTiempo = System.nanoTime() - tiempoInicio2;
		System.out.println("Tiempo demorado:\t" + totalTiempo + " nanosegundos");	
		sc.close();
	}

}
