import java.util.Random;

public class Moneda {
    private int[] denominacionMoneda;

    public Moneda() {
        this.denominacionMoneda = new int[] {50, 100, 200, 500, 1000};
    }

    private int generarMoneda() {
        final int VALOR_MAXIMO = 5;
        int valor = 0;
        
        Random rnd = new Random();
        valor = rnd.nextInt(VALOR_MAXIMO);

        return this.denominacionMoneda[valor];
    }

    public int obtenerMoneda() {
        return generarMoneda();
    }
}
