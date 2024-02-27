package HW1;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    private final List<HotDrink> hotDrinkList;

    public HotDrinksVendingMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public HotDrink getProduct(String name, int temperature, double volume) {
        for (int i = 0; i < this.hotDrinkList.size() - 1; i++) {
            HotDrink current = hotDrinkList.get(i);
            if (current.getName().equals(name) && current.getVolume() == volume && ((Coffee) current).getTemperature() == temperature) {
                return hotDrinkList.get(i);
            }
        }
        return null;
    }

    @Override
    public HotDrink getProduct(String name) {
        for (int i = 0; i < this.hotDrinkList.size(); i++) {
            if (hotDrinkList.get(i).getName().equals(name)) {
                return hotDrinkList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<HotDrink> getDrinksList() {
        return this.hotDrinkList;
    }

    @Override
    public String toString() {
        return "HotDrinksVendingMachine{" +
                "hotDrinkList=" + hotDrinkList +
                '}';
    }
}
