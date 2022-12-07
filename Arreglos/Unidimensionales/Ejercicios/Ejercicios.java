import java.math.BigInteger;

public class Ejercicios {

    private Vista vista;

    public Ejercicios(Vista vista) {
        this.vista = vista;
    }
    
    public void ejercicio7(int[] arr) {
        Metodos.invertir(arr);
        vista.mostrarArreglo("Invertido", arr);
    }

    public void ejercicio71(BigInteger[] primos) {
        int totalPrimos = Metodos.inicializarPrimos(primos, 10);
        vista.mostrarArreglo("Primos", primos, totalPrimos);
    }
}
