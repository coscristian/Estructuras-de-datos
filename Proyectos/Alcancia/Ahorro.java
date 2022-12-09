/**
 * Clase que contabiliza el total ahorrado
 * @Project Alcancia
 * @FileName Alcancia.java
 * @author Cristian Quesada Cossio
 * @version 1.0
 */

public class Ahorro {
    private Alcancia unaAlcancia;
    private static final int CINCUENTA = 50;
    private static final int CIEN = 100;
    private static final int DOSCIENTOS = 200;
    private static final int QUINIENTOS = 500;
    private static final int MIL = 1000;
    private int[] totalMonedas;

    public Ahorro() {
        this.unaAlcancia = new Alcancia();
        this.totalMonedas = unaAlcancia.obtenerAlcancia();
        this.unaAlcancia.llenarAlcancia();
    }

    public int obtenerCantidadMonedasCincuenta() {
        return totalMonedas[0] / CINCUENTA;
    }

    public int obtenerAhorroMonedasCincuenta() {
        return totalMonedas[0];
    }

    public int obtenerCantidadMonedasCien() {
        return totalMonedas[1] / CIEN;
    }

    public int obtenerAhorroMonedasCien() {
        return totalMonedas[1];
    }

    public int obtenerCantidadMonedasDoscientos() {
        return totalMonedas[2] / DOSCIENTOS;
    }

    public int obtenerAhorroMonedasDoscientos() {
        return totalMonedas[2];
    }

    public int obtenerCantidadMonedasQuinientos() {
        return totalMonedas[3] / QUINIENTOS;
    }

    public int obtenerAhorroMonedasQuinientos() {
        return totalMonedas[3];
    }

    public int obtenerCantidadMonedasMil() {
        return totalMonedas[4] / MIL;
    }

    public int obtenerAhorroMonedasMil() {
        return totalMonedas[4];
    }

    public int obtenerTotalAhorrado() {
        return obtenerAhorroMonedasCincuenta() + obtenerAhorroMonedasCien() + obtenerAhorroMonedasDoscientos() + obtenerAhorroMonedasQuinientos() + obtenerAhorroMonedasMil();
    }
}
