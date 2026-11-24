package padroesestruturais.adapter;

public class TemperaturaAdapter extends SensorFahrenheit {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public float recuperarTemperatura() {
        temperaturaCelsius.setTemperatura((this.getFahrenheit() - 32) * 5 / 9);
        return temperaturaCelsius.getTemperatura();
    }

    public void salvarTemperatura() {
        this.setFahrenheit(temperaturaCelsius.getTemperatura() * 9 / 5 + 32);
    }
}
