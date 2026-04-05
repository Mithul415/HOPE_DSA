public abstract class Sensor {
    protected String name;
    public Sensor(String name) {
        this.name = name;
    }
    public abstract double readData();
}