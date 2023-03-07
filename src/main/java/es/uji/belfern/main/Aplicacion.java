package es.uji.belfern.main;

import es.uji.belfern.menu.Menu;
import es.uji.belfern.modelo.Modelo;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacion {
    Scanner teclado = new Scanner(System.in);
    Modelo modelo = new Modelo();

    public Aplicacion() {

    }

    void ejecuta() {
        teclado.useLocale(Locale.US);
        Menu option;
        do {
            prompt();
            option = getOption();
            filtraOpcion(option);
        } while (option != Menu.SALIR);
    }

    private Menu getOption() {
        Menu option;
        int intOption = teclado.nextInt();
        option = Menu.getOpcion(intOption);
        return option;
    }

    private void prompt() {
        System.out.println(Menu.getMenu());
        System.out.print("Introduce una opción: ");
    }

    private void filtraOpcion(final Menu opcion) {
        switch (opcion) {
            case RETIRAR_EFECTIVO:
                retirarEfectivo();
                break;
            case REALIZAR_INGRESO:
                realizarIngreso();
                break;
            case CONSULTAR_SALDO:
                consultarSaldo();
                break;
            case RECARGAR_TARJETA:
                recargarTarjeta();
                break;
            case REALIZAR_TRANSFERENCIA:
                realizarTranferencia();
                break;
            case CONSULTAR_OPERACIONES:
                consultarOperaciones();
                break;
            case SALIR:
                salir();
                break;
        }
    }

    private void retirarEfectivo() {
        System.out.print("Cantidad a retirar: ");
        double cantidad = teclado.nextDouble();
        modelo.retirarEfectivo(cantidad);

    }

    private void realizarIngreso() {
        System.out.print("Cantidad a ingresar: ");
        double cantidad = teclado.nextDouble();
        modelo.realizarIngreso(cantidad);
    }

    private void consultarSaldo() {
        System.out.println(modelo.consultarSaldo());
    }

    private void recargarTarjeta() {
        System.out.print("Importe de la recarga: ");
        double cantidad = teclado.nextDouble();
        modelo.recargarTarjeta(cantidad);
    }

    private void realizarTranferencia() {
        System.out.print("Cantidad a transferir: ");
        double cantidad = teclado.nextDouble();
        modelo.realizarTransferencia(cantidad);
    }

    private void consultarOperaciones() {
        System.out.println(modelo.operaciones());
    }

    private void salir() {
        System.out.println("Salir.");
    }

}
