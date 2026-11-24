package padroesestruturais.adapter;

public class Termometro {

    ITemperatura temperatura;
    TemperaturaAdapter sensor;

    public Termometro() {
        temperatura = new TemperaturaCelsius();
        sensor = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(float celsius) {
        temperatura.setTemperatura(celsius);
        sensor.salvarTemperatura();
    }

    public float getTemperatura() {
        return sensor.recuperarTemperatura();
    }

    public float getFahrenheit() {
        return sensor.getFahrenheit();
    }

}
