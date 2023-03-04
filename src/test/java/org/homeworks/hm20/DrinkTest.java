package org.homeworks.hm20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    Drinks drink = new Drinks();

    @Test
    void makeSingleOrder() {
        Assertions.assertEquals(2.25, drink.makeOrder(DrinksMachine.MOHITO));
        Assertions.assertEquals(1, Drinks.getOrderedDrinksCount());
    }

    @Test
    void makeMultipleOrder() {
        Assertions.assertEquals(5.15, drink.makeOrder(DrinksMachine.WATER, DrinksMachine.TEA, DrinksMachine.COCA_COLA, DrinksMachine.LYMONADE));
        Assertions.assertEquals(4, Drinks.getOrderedDrinksCount());
    }

    @Test
    void makeOrderCheckForNull() {
        Assertions.assertThrows(IllegalStateException.class, () -> drink.makeOrder(null));
    }
    @Test
    void makeOrderDeepCheckForNull_AndSafeOrderData() {
        Assertions.assertThrows(IllegalStateException.class, () -> drink.makeOrder(DrinksMachine.COFFEE, null));
        Assertions.assertEquals(1.5, Drinks.getTotalPriceToPay());
        Assertions.assertEquals(1, Drinks.getOrderedDrinksCount());
    }
}
