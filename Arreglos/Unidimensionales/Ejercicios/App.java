import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Objetos necesarios
        Menu menu = new Menu();
        Vista vista = new Vista();
        Ejercicios ejercicios = new Ejercicios(vista);

        final int TAMANIO_ARRAY = 10;
        int[] arr = new int[TAMANIO_ARRAY];
        BigInteger[] primos = new BigInteger[TAMANIO_ARRAY];

        arr = Metodos.inicializar(TAMANIO_ARRAY);
        vista.mostrarArreglo("Inicialización", arr);

        int opcion = 0;

        do {
            opcion = menu.crearMenu();
            switch (opcion) {
                case 7:
                    ejercicios.ejercicio7(arr);
                    break;
                case 71:
                    ejercicios.ejercicio71(primos);
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        
        // Ejercicio 8 
        int[] arr2 = new int[4]; int cont = 1;
        
        for(int i = 0; i < arr2.length; i +=2) {
            arr2[i] = cont; cont++;
        }

        for(int i = arr2.length - 1; i > 0; i--) {
            if(arr2[i] == 0){
                arr2[i] = cont; cont++;
            }
        }

        System.out.println("Recorridos IZQ - DER / DER - IZQ");
        for (int i : arr2) {
            System.out.printf("%d - ", i);
        }
        System.out.println();

        // Ejercicio 9
        System.out.printf("Ingrese el tamaño del arreglo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rnd = new Random();

        int[] arr3 = new int[n];
        for(int i = 0; i < arr3.length; i++) arr3[i] = rnd.nextInt(25);

        for (int i : arr3) {
            System.out.printf("%d - ", i);
        }
        
        Arrays.sort(arr3);
        System.out.printf("\nOrdenado: \n");
        for (int i : arr3) {
            System.out.printf("%d - ", i);
        }

        System.out.printf("\nIngrese el número que desea buscar: ");
        int num = sc.nextInt();
        int posicionElemento = Arrays.binarySearch(arr3, num);
        
        if ( posicionElemento >= 0) 
            System.out.printf("El elemento se encuentra en la posición %d\n", posicionElemento);
        else
            System.out.println("El elemento no se encuentra en el array!!\n");




        sc.close();
    }
}