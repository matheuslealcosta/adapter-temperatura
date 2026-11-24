package padroesestruturais.adapter;

public class TemperaturaCelsius implements ITemperatura {

    private float celsius;

    @Override
    public float getTemperatura() {
        return this.celsius;
    }

    @Override
    public void setTemperatura(float celsius) {
        this.celsius = celsius;
    }
}
