import java.text.DecimalFormat;

/**
 * Clase que imprime totales de monedas
 * @Project Alcancia
 * @FileName AppAlcancia.java
 * @author Cristian Quesada Cossio
 * @version 1.0
 */

public class AppAlcancia {
    private Ahorro ahorroAlcancia;

    public AppAlcancia() {
        this.ahorroAlcancia = new Ahorro();
    }

    public static void main(String[] args) {
        AppAlcancia totalAhorro = new AppAlcancia();
        totalAhorro.imprimirTotales();
    }

    /**
     * Método que imprime tanto la cantidad de monedas por denominación $50, $100, $200, $500, $1000
     * como el total ahorrado
     */
    private void imprimirTotales() {
        DecimalFormat unFormato = new DecimalFormat("'$'#,###,###,###");
        int ahorro = 0;

        System.out.println();

        System.out.println("Cantidad de monedas de $50 >> " + ahorroAlcancia.obtenerCantidadMonedasCincuenta());
        ahorro = ahorroAlcancia.obtenerAhorroMonedasCincuenta();
        System.out.println("Total ahorro moneda de $50 >> " + unFormato.format(ahorro));

        System.out.println("\nCantidad de monedas de $100 >> " + ahorroAlcancia.obtenerCantidadMonedasCien());
        ahorro = ahorroAlcancia.obtenerAhorroMonedasCien();
        System.out.println("Total ahorro moneda de $100 >> " + unFormato.format(ahorro));

        System.out.println("\nCantidad de monedas de $200 >> " + ahorroAlcancia.obtenerCantidadMonedasDoscientos());
        ahorro = ahorroAlcancia.obtenerAhorroMonedasDoscientos();
        System.out.println("Total ahorro moneda de $200 >> " + unFormato.format(ahorro));

        System.out.println("\nCantidad de monedas de $500 >> " + ahorroAlcancia.obtenerCantidadMonedasQuinientos());
        ahorro = ahorroAlcancia.obtenerAhorroMonedasQuinientos();
        System.out.println("Total ahorro moneda de $500 >> " + unFormato.format(ahorro));

        System.out.println("\nCantidad de monedas de $1000 >> " + ahorroAlcancia.obtenerCantidadMonedasMil());
        ahorro = ahorroAlcancia.obtenerAhorroMonedasMil();
        System.out.println("Total ahorro moneda de $1000 >> " + unFormato.format(ahorro));

        System.out.println();

    }


}
