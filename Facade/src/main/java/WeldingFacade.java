import equipments.Equipment;
import equipments.EquipmentFactory;
import products.Coffee;
import products.Product;
import products.Tea;

public class WeldingFacade {
    public Product weld(String type, String productName) {
        Equipment equipment = EquipmentFactory.factory(type);
        Product product = equipment.make(productName);

        if (product instanceof Tea) {
            product.addIngredient("Sugar");
        }

        if (product instanceof Coffee) {
            product.addIngredient("Milk");
        }

        return product;
    }
}
