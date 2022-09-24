package ejemplo2;

public class Factorial {
	
	public static double calcularFactorial(int n) {
		double fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i; 
		}
		return fact;
	}
}
