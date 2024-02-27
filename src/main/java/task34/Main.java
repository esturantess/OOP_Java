package task34;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> bottleOfWaterList = new ArrayList<>();

        bottleOfWaterList.add(new BottleOfWater(1, "Bonaqua", "good water or not idk", 50, 10, 1));
        bottleOfWaterList.add(new BottleOfWater(1, "Just Water", "-", 30, 5, 0.5));
        bottleOfWaterList.add(new BottleOfWater(1, "Aqua Mineral", "idk", 45, 7, 0.75));
        BottleOfWaterVendingMachine machine1 = new BottleOfWaterVendingMachine();
        machine1.initProducts(bottleOfWaterList);

        System.out.println(machine1.getProduct("Bonaqua", 1));
        System.out.println(machine1.getProduct("pig"));
    }
}