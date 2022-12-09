import java.math.BigInteger;
import java.util.Scanner;

public class Vista {
    private Scanner sc;

    public Vista(Scanner sc) {
        this.sc = sc;
    }
    
    public void mostrarArreglo(String mensaje, int[] arreglo) {
        System.out.printf("\n%s\n", mensaje);

        for(int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d - ", arreglo[i]);
        }
        System.out.println();
    }

    public void mostrarArreglo(String mensaje, BigInteger[] arreglo, int totalPrimos) {
        System.out.printf("\n%s\n", mensaje);

        for(int i = 1; i < totalPrimos; i++) {
            System.out.printf("%s - ", arreglo[i].toString());
        } 
        System.out.println();
    }

    public int leerEntero(String mensaje) {
        System.out.printf("\n%s: ", mensaje);
        int num = this.sc.nextInt();
        return num;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void limpiarConsola() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public void esperarEntrada() {
        System.out.println("Presione ENTER para continuar");
        sc.nextLine();
    }

    public void leerEntrada() {
        sc.nextLine();
    }


            


}
