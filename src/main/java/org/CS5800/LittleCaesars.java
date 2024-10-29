package org.CS5800;

import java.util.List;

public class LittleCaesars extends PizzaBase {
    public LittleCaesars(Size size, List<String> toppings) {
        super(size, toppings);
    }

    @Override
    public void eat() {
        System.out.println("LittleCaesars " + size + " pizza with toppings: " + String.join(", ", toppings));
    }
}
