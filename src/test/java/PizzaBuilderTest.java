import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.PizzaBase;
import org.CS5800.PizzaBuilder;
import org.CS5800.Size;
import org.junit.jupiter.api.Test;
import java.util.List;

class PizzaBuilderTest {

    @Test
    void testSetSize() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setSize(Size.LARGE);
        PizzaBase pizza = builder.build();
        assertEquals(Size.LARGE, pizza.getSize(), "The pizza size should be LARGE.");
    }

    @Test
    void testAddTopping() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.addTopping("Pepperoni");
        PizzaBase pizza = builder.build();
        assertTrue(pizza.getToppings().contains("Pepperoni"), "The pizza should contain 'Pepperoni' as a topping.");
    }

    @Test
    void testMultipleToppings() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.addTopping("Mushrooms").addTopping("Bacon").addTopping("Onions");
        PizzaBase pizza = builder.build();
        assertEquals(3, pizza.getToppings().size(), "The pizza should have 3 toppings.");
        assertTrue(pizza.getToppings().containsAll(List.of("Mushrooms", "Bacon", "Onions")),
                "The pizza should contain 'Mushrooms', 'Bacon', and 'Onions' as toppings.");
    }

    @Test
    void testBuildWithSizeAndToppings() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setSize(Size.MEDIUM).addTopping("Extra Cheese").addTopping("Spinach");
        PizzaBase pizza = builder.build();

        assertEquals(Size.MEDIUM, pizza.getSize(), "The pizza size should be MEDIUM.");
        assertEquals(2, pizza.getToppings().size(), "The pizza should have 2 toppings.");
        assertTrue(pizza.getToppings().containsAll(List.of("Extra Cheese", "Spinach")),
                "The pizza should contain 'Extra Cheese' and 'Spinach' as toppings.");
    }

    @Test
    void testEatMethodOutput() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setSize(Size.SMALL).addTopping("Tomato").addTopping("Basil");
        PizzaBase pizza = builder.build();

        // Redirect output for testing `eat` method's output
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pizza.eat();

        assertTrue(outContent.toString().contains("SMALL pizza with toppings: Tomato, Basil"),
                "The output of eat() should contain 'SMALL pizza with toppings: Tomato, Basil'.");

        // Reset System.out
        System.setOut(System.out);
    }
}
