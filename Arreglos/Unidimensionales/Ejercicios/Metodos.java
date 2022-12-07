import java.math.BigInteger;
import java.util.Random;

public class Metodos {

    static int[] inicializar(int size) {
        int[] datos = new int[size];
        Random rnd = new Random();

        for(int i = 0; i < size; i++) datos[i] = rnd.nextInt(100 + 1);
        return datos;
    }

    static void invertir(int datos[]) {
        int long_arreglo = datos.length;
        int ult_pos = datos.length - 1;
        
        for(int i = 0; i < long_arreglo / 2; i++) {
            int aux = datos[i];
            datos[i] = datos[ult_pos];
            datos[ult_pos] = aux;
            ult_pos--;
        }        
    }

    static int inicializarPrimos(BigInteger[] primes, int size) {

        BigInteger[] arr = new BigInteger[size + 1];

        int rootSize = (int) Math.floor(Math.sqrt(size));
        int idPrime = 1;

        arr[0] = arr[1] = BigInteger.ZERO;
        
        for(int i = 2; i <= size; i++) {
            arr[i] = BigInteger.ONE;
        }

        for(int i = 2; i <= rootSize; i++) {
            if(arr[i].compareTo(BigInteger.ONE) == 0) {
                for(int j = i; j <= size / i; j++) {
                    arr[i * j] = BigInteger.ZERO;
                }
            }
        }

        for(int i = 2; i <= size; i++) {
            if(arr[i].compareTo(BigInteger.ONE) == 0) {
                primes[idPrime] = BigInteger.valueOf(i);
                idPrime++;
            }
        }

        return idPrime - 1;
    }
}
