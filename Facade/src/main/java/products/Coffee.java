package products;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements Product {
    private final String name;
    private final List<String> ingredients;

    public Coffee(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String getFullName() {
        StringBuilder builder = new StringBuilder();
        builder.append("Coffee ").append(name).append('[');
        for (String i : ingredients) {
            builder.append(i).append(',');
        }
        builder.append(']');

        return builder.toString();
    }

    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
}
