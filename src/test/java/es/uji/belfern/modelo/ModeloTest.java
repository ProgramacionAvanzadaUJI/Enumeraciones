package es.uji.belfern.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

class ModeloTest {
    Modelo modelo;

    @BeforeEach
    void setUp() {
        modelo = new Modelo();
    }

    @Test
    void retirarEfectivo() {
        modelo.retirarEfectivo(10);
        double saldo = modelo.consultarSaldo();
        assertThat(saldo, is(90.0));
    }

    @Test
    void realizarIngreso() {
        modelo.realizarIngreso(10);
        double saldo = modelo.consultarSaldo();
        assertThat(saldo, is(110.0));
    }

    @Test
    void consultarSaldo() {
        assertThat(modelo.consultarSaldo(), is(100.0));
    }

    @Test
    void recargarTarjeta() {
        modelo.recargarTarjeta(23.5);
        double saldo = modelo.consultarSaldo();
        assertThat(saldo, is(76.5));
    }

    @Test
    void realizarTransferencia() {
        modelo.realizarTransferencia(34.20);
        double saldo = modelo.consultarSaldo();
        assertThat(saldo, is(65.80));
    }
}