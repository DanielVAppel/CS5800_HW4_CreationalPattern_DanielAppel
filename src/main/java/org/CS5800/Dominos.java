package org.CS5800;

import java.util.List;

public class Dominos extends PizzaBase {
    public Dominos(Size size, List<String> toppings) {
        super(size, toppings);
    }

    @Override
    public void eat() {
        System.out.println("Dominos " + size + " pizza with toppings: " + String.join(", ", toppings));
    }
}
