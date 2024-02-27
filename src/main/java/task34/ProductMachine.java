package task34;

import java.util.List;

interface ProductMachine {

    void initProducts (List<Product> productList);
    public Product getProduct (String name);

    public List<Product> getProductList();

    public void setProductList(List<Product> productList);
}
