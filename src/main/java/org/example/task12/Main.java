package org.example.task12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        ProductMachine machine1 = new ProductMachine(productList, 1);
        machine1.setProductList(machine1.initProducts(productList));

        System.out.println(machine1.getProduct("potato"));
        System.out.println(machine1.getProduct("pot"));
        System.out.println(machine1.getProduct("beer"));
        System.out.println(machine1.getProduct("chips"));

    }
}