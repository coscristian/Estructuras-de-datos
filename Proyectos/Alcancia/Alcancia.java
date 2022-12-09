/**
 * Clase que modela el ingreso de monedas a la alcancia
 * @Project Alcancia
 * @File Name: Alcancia.java
 * @author: Cristian Quesada Cossio
 * @version 1.0
 */

public class Alcancia {
    private int[] moneda;
    private Moneda valorMoneda;

    /*
     * Creación de la alcancia
     */
    public Alcancia() {
        this.moneda = new int[5];
        this.valorMoneda = new Moneda();
    }

    public int[] obtenerAlcancia() {
        return moneda;
    }

    public void inicializarAlcancia() {
        for(int i = 0; i < moneda.length; i++) {
            moneda[i] = 0;
        }
    }

    /**
     * Método que llena la alcancia con mil monedas
     */
    public void llenarAlcancia() {
        inicializarAlcancia();
        final int CINCUENTA = 50;
        final int CIEN = 100;
        final int DOSCIENTOS = 200;
        final int QUINIENTOS = 500;
        final int MIL = 1000;
        final int LIMITE = 1000;
        int valor = 0;

        for(int i = 1; i <= LIMITE; i++) {
            valor = valorMoneda.obtenerMoneda();
            if(valor == CINCUENTA) this.moneda[0] += valor;
            else if (valor == CIEN) this.moneda[1] += valor;
            else if (valor == DOSCIENTOS) this.moneda[2] += valor;
            else if (valor == QUINIENTOS) this.moneda[3] += valor;
            else if (valor == MIL) this.moneda[4] += valor;
        }
    }
}
