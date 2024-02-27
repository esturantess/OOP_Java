package task34;

public class BottleOfWater extends Product{

    private double volume;
    public BottleOfWater(int id, String name, String description, int price, int quantity, double volume) {
        super(id, name, description, price, quantity);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", quantity=" + super.getQuantity() + '\'' +
                ", volume=" + volume +
                '}';
    }
}
