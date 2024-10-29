package org.CS5800;

import java.util.List;

public class PizzaBase {
    protected final Size size;
    protected final List<String> toppings;

    public PizzaBase(Size size, List<String> toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println(size + " pizza with toppings: " + String.join(", ", toppings));
    }

    // Add getters for testing
    public Size getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
