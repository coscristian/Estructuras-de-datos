import java.math.BigInteger;

public class Vista {
    
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

            


}
