package equipments;

import products.Coffee;
import products.Product;

public class Cezve implements Equipment {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}
