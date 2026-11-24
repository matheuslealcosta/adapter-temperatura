package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarTemperaturaCelsius() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(25.0f);

        assertEquals(25.0f, termometro.getTemperatura());
    }

    @Test
    void deveRetornarTemperaturaFahrenheit() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(25.0f);

        assertEquals(77.0f, termometro.getFahrenheit());
    }

    @Test
    void deveConverterPontoDeEbulicao() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(100.0f);

        assertEquals(212.0f, termometro.getFahrenheit());
    }

}
