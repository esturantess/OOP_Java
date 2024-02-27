package HW1;

public class Coffee extends HotDrink {

    private int temperature;

    public Coffee(String name, int temperature, double volume, double price) {
        super.setName(name);
        super.setVolume(volume);
        super.setPrice(price);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name=" + super.getName() +
                ", temperature=" + temperature +
                ", volume=" + super.getVolume() +
                ", price=" + super.getPrice() +
                '}';
    }
}
