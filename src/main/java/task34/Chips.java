package task34;

public class Chips extends Product{

    private int size;
    private Chips(int id, String name, String description, int price, int quantity, int size) {
        super(id, name, description, price, quantity);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
