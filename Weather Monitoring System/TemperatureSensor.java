import java.util.Random;
public class TemperatureSensor extends Sensor {
    public TemperatureSensor(String name) {
        super(name);
    }

    @Override
    public double readData() {
        Random r = new Random();
        return 20 + r.nextInt(15);
    }
}