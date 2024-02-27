package HW1;


import java.util.List;

public interface VendingMachine {

    HotDrink getProduct(String name, int temperature, double volume);
    HotDrink getProduct(String name);

    public List<HotDrink> getDrinksList();

}
