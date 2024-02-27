package task34;

import java.util.List;

public class BottleOfWaterVendingMachine implements ProductMachine {

    private List<Product> bottleOfWaterList;

    @Override
    public void initProducts(List<Product> productList) {
        this.bottleOfWaterList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product bottle : bottleOfWaterList) {
            if (bottle.getName().equals(name)) {
                return bottle;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume){
        for (Product bottle : bottleOfWaterList)
            if(bottle.getName().equals(name) && ((BottleOfWater) bottle).getVolume() == volume)
                return bottle;
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return bottleOfWaterList;
    }

    @Override
    public void setProductList(List<Product> productList) {
        this.bottleOfWaterList = productList;
    }

    @Override
    public String toString() {
        return "BottleOfWaterVendingMachine{" +
                "bottleOfWaterList=" + bottleOfWaterList +
                '}';
    }
}
