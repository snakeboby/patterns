package equipments;

public class EquipmentFactory {
    public static Equipment factory(String type) {
        return switch (type) {
            case "Tea machine" -> new TeaMachine();
            case "Samovar" -> new Samovar();
            case "Coffee machine" -> new CoffeeMachine();
            case "Cezve" -> new Cezve();
            default -> throw new RuntimeException("Not found equipment");
        };
    }
}
