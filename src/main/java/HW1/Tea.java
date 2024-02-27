package HW1;

public class Tea extends HotDrink{

    private boolean sugar;

    public Tea(String name, double volume, double price, boolean sugar) {
        this.sugar = sugar;
        super.setName(name);
        super.setVolume(volume);
        super.setPrice(price);
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name=" + super.getName() +
                ", volume=" + super.getVolume() +
                ", price=" + super.getPrice() +
                ", sugar=" + sugar +
                '}';
    }
}
