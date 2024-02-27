package Sem1.task12;

import java.util.List;

public class ProductMachine {
    private List<Product> productList;
    private int id;

    List<Product> initProducts (List<Product> productList){

        productList.add(new Product(1, "potato", "-", 10 , 5));
        productList.add(new Product(2, "tomato", "-", 11,  2));
        productList.add(new Product(3, "chips", "-", 60, 10));
        return productList;
    }
    public Product getProduct (String name){
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ProductMachine(List<Product> productList, int id) {
        this.productList = productList;
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
