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
        operaciones.add(Menu.RETIRAR_EFECTIVO.getTitle() + " " +cantidad);
    }

    public void realizarIngreso(final double cantidad) {
        saldo += cantidad;
        operaciones.add(Menu.REALIZAR_INGRESO.getTitle() + " " + cantidad);
    }

    public double consultarSaldo() {
        operaciones.add(Menu.CONSULTAR_SALDO.getTitle());
        return saldo;
    }

    public void recargarTarjeta(final double cantidad) {
        saldo -= cantidad;
        operaciones.add(Menu.RECARGAR_TARJETA.getTitle() + " " + cantidad);
    }

    public void realizarTransferencia(final double cantidad) {
        saldo -= cantidad;
        operaciones.add(Menu.REALIZAR_TRANSFERENCIA.getTitle() + " " + cantidad);
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
