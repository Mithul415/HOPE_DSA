import java.util.Random;
public class HumiditySensor extends Sensor {
    public HumiditySensor(String name) {
        super(name);
    }

    @Override
    public double readData() {
        Random r = new Random();
        return 40 + r.nextInt(40);
    }
}