package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HotDrink> drinkList1 = new ArrayList<>();
        drinkList1.add(new Coffee("latte", 50, 0.4, 70));
        drinkList1.add(new Coffee("americano", 55, 0.3, 65));
        drinkList1.add(new Tea("green tea", 0.3, 55, true));

        List<HotDrink> drinkList2 = new ArrayList<>();
        drinkList2.add(new Tea("black tea", 0.2, 40, false));
        drinkList2.addAll(1,drinkList1);

        HotDrinksVendingMachine drinksVendingMachine1 = new HotDrinksVendingMachine(drinkList1);
        HotDrinksVendingMachine drinksVendingMachine2 = new HotDrinksVendingMachine(drinkList2);
        System.out.println(drinksVendingMachine1.getProduct("latte", 50, 0.4));
        System.out.println(drinksVendingMachine2.getProduct("black tea"));

    }
}
