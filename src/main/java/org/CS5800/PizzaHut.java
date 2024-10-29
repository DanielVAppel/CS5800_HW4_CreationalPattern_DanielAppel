package org.CS5800;

import java.util.List;

public class PizzaHut extends PizzaBase {
    public PizzaHut(Size size, List<String> toppings) {
        super(size, toppings);
    }

    @Override
    public void eat() {
        System.out.println("PizzaHut " + size + " pizza with toppings: " + String.join(", ", toppings));
    }
}
