package org.CS5800;

import java.util.List;

public class PizzaDriver {
    public static void main(String[] args) {
        // create three pizzas of varying sizes with 3, 6, and 9 toppings from random chains.

        PizzaBase randomSmallPizza = new PizzaHut(Size.SMALL, List.of("Pepperoni", "Mushrooms", "Onions"));
        randomSmallPizza.eat();

        PizzaBase randomMediumPizza = new LittleCaesars(Size.MEDIUM, List.of("Pepperoni", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers"));
        randomMediumPizza.eat();

        PizzaBase randomLargePizza = new Dominos(Size.LARGE, List.of("Pepperoni", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach"));
        randomLargePizza.eat();

        // Pizza Hut
        PizzaBase pizzaHutLarge3Toppings = new PizzaHut(Size.LARGE, List.of("Pepperoni", "Mushrooms", "Bacon"));
        pizzaHutLarge3Toppings.eat();

        PizzaBase pizzaHutSmall2Toppings = new PizzaHut(Size.SMALL, List.of("Onions", "Peppers"));
        pizzaHutSmall2Toppings.eat();

        // Little Caesars
        PizzaBase littleCaesarsMedium8Toppings = new LittleCaesars(Size.MEDIUM, List.of("Onions", "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach", "Tomato", "Basil"));
        littleCaesarsMedium8Toppings.eat();

        PizzaBase littleCaesarsSmall6Toppings = new LittleCaesars(Size.SMALL, List.of("Pepperoni", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers"));
        littleCaesarsSmall6Toppings.eat();

        // Dominos
        PizzaBase dominosSmall1Topping = new Dominos(Size.SMALL, List.of("Pesto"));
        dominosSmall1Topping.eat();

        PizzaBase dominosLarge3Toppings = new Dominos(Size.LARGE, List.of("Pepperoni", "Mushrooms", "Bacon"));
        dominosLarge3Toppings.eat();
    }
}
