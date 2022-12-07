import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Objetos necesarios
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Vista vista = new Vista(sc);
        Ejercicios ejercicios = new Ejercicios(vista);

        final int TAMANIO_ARRAY = 10;
        int[] arr = new int[TAMANIO_ARRAY];
        BigInteger[] primos = new BigInteger[TAMANIO_ARRAY];
        int[] arr2 = new int[4];

        arr = Metodos.inicializar(TAMANIO_ARRAY);
        vista.mostrarArreglo("Inicialización", arr);

        int opcion = 0;

        do {
            opcion = menu.crearMenu();
            switch (opcion) {
                case 7:
                    ejercicios.ejercicio7(arr); break;                    
                case 71:
                    ejercicios.ejercicio71(primos); break;     
                case 8:
                    ejercicios.ejercicio8(arr2); break;
                case 9:
                    ejercicios.ejercicio9(); break;
                default:
                    break;
            }
            vista.esperarEntrada();
            vista.limpiarConsola();
        } while (opcion != 0);
        sc.close();
    }
}