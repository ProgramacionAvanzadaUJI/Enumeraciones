package es.uji.belfern.modelo;

import es.uji.belfern.menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modelo {
    private double saldo = 100.00;
    private List<String> operaciones = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);

    public void retirarEfectivo(final double cantidad) {
        saldo -= cantidad;
        operaciones.add("Se han retirado " + +cantidad + " euros.");
    }

    public void realizarIngreso(final double cantidad) {
        saldo += cantidad;
        operaciones.add("Se han ingresado " + cantidad + " euros.");
    }

    public double consultarSaldo() {
        operaciones.add("Se ha consultado el saldo de la cuenta.");
        return saldo;
    }

    public void recargarTarjeta(final double cantidad) {
        saldo -= cantidad;
        operaciones.add("Se ha recargado una tarjeta con " + cantidad + " euros.");
    }

    public void realizarTransferencia(final double cantidad) {
        saldo -= cantidad;
        operaciones.add("Se ha realizado una transferencia de " + cantidad + " euros.");
    }

    public String operaciones() {
        StringBuilder sb = new StringBuilder();

        for(String operacion: operaciones) {
            sb.append(operacion);
            sb.append("\n");
        }

        return sb.toString();
    }
}
