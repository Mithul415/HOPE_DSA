public class WeatherStation {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor("Temp Sensor");
        Sensor humSensor = new HumiditySensor("Humidity Sensor");

        double temp = tempSensor.readData();
        double humidity = humSensor.readData();

        if (temp < -50 || temp > 60) {
            System.out.println("Invalid temperature reading!");
            return;
        }

        if (humidity < 0 || humidity > 100) {
            System.out.println("Invalid humidity reading!");
            return;
        }

        WeatherData data = new WeatherData(temp, humidity);
        data.display();

        if (temp > 30) {
            System.out.println("Hot weather alert!");
        }
    }
}