package es.uji.belfern.menu;

public enum Menu {
    RETIRAR_EFECTIVO("Retirar dinero en efectivo."),
    REALIZAR_INGRESO("Realizar ingreso."),
    CONSULTAR_SALDO("Consultar el saldo de su cuenta."),
    RECARGAR_TARJETA("Recargar su tarjeta de débito."),
    REALIZAR_TRANSFERENCIA("Realizar una transferencia."),
    CONSULTAR_OPERACIONES("Consultar operaciones."),
    SALIR("Salir de la aplicación.");

    private String title;

    Menu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Menu getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(Menu opcion: Menu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.title);
            sb.append("\n");
        }
        return sb.toString();
    }
}
