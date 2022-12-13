package equipments;

import products.Product;
import products.Tea;

public class TeaMachine implements Equipment {
    @Override
    public Product make(String name) {
        return new Tea(name);
    }
}
