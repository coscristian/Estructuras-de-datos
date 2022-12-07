import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

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

    public void ejercicio8(int[] arr) {
        // Ejercicio 8 
        int cont = 1;

        for(int i = 0; i < arr.length; i +=2) {
            arr[i] = cont; cont++;
        }

        for(int i = arr.length - 1; i > 0; i--) {
            if(arr[i] == 0){
                arr[i] = cont; cont++;
            }
        }

        vista.mostrarArreglo("Recorridos IZQ - DER / DER - IZQ", arr);
    }

    public void ejercicio9() {
        int n = vista.leerEntero("Ingrese el tamaño del arreglo: ");
        int[] arr3 = new int[n];

        Random rnd = new Random();

        for(int i = 0; i < arr3.length; i++) arr3[i] = rnd.nextInt(25);

        vista.mostrarArreglo("Arreglo generado", arr3);
        
        Arrays.sort(arr3);
        vista.mostrarArreglo("Ordenado", arr3);

        int num = vista.leerEntero("Ingrese el número que desea buscar: ");
        int posicionElemento = Arrays.binarySearch(arr3, num);
        
        vista.leerEntrada();

        if ( posicionElemento >= 0) 
            vista.mostrarMensaje("El elemento se encuentra en el arreglo");
        else
            vista.mostrarMensaje("El elemento no se encuentra en el array!!\n");
        
    }
}
