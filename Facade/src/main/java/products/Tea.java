package products;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Product {
    private final String name;
    private final List<String> ingredients;

    public Tea(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String getFullName() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tea ").append(name).append('[');
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
