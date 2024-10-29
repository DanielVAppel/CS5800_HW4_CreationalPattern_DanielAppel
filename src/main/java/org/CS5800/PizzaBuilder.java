package org.CS5800;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Size size;
    private final List<String> toppings = new ArrayList<>();

    public PizzaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public PizzaBase build() {
        return new PizzaBase(size, toppings);
    }
}

