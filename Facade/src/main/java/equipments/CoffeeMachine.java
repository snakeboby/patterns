package equipments;

import products.Coffee;
import products.Product;

public class CoffeeMachine implements Equipment {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}
