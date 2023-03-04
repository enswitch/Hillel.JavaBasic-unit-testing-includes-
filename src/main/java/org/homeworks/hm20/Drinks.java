package org.homeworks.hm20;

public class Drinks {
    private static int orderedDrinksCount = 0;
    private static double totalPriceToPay = 0;

    public static int getOrderedDrinksCount() {
        return orderedDrinksCount;
    }

    public static double getTotalPriceToPay() {
        return totalPriceToPay;
    }

    public void orderProcess(DrinksMachine item) { //technical method which not returns smth and live in makeOrder method only, I don`t know if important to create unit test for this method
        item.makeDrink();
        System.out.println("The price for a " + item.name().toLowerCase() + " would be " + item.getPriceDrink() + "$");
        System.out.println();
        orderedDrinksCount++;
        totalPriceToPay += item.getPriceDrink();
    }

    public double makeOrder(DrinksMachine... order) {
        if (order == null) {
            throw new IllegalStateException("No one of drinks was chosen!");
        }
        for (int i = 0; i < order.length; i++) {
            if (order[i] == null) {
                throw new IllegalStateException("Choose next drink or finish the order!");
            }
            switch (order[i]) {
                case COFFEE: {
                    orderProcess(DrinksMachine.COFFEE);
                    break;
                }
                case TEA: {
                    orderProcess(DrinksMachine.TEA);
                    break;
                }
                case LYMONADE: {
                    orderProcess(DrinksMachine.LYMONADE);
                    break;
                }
                case MOHITO: {
                    orderProcess(DrinksMachine.MOHITO);
                    break;
                }
                case WATER: {
                    orderProcess(DrinksMachine.WATER);
                    break;
                }
                case COCA_COLA: {
                    orderProcess(DrinksMachine.COCA_COLA);
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unknown item");
            }
        }
        System.out.println("Drinks were bought: " + getOrderedDrinksCount());
        System.out.println("Total price: " + getTotalPriceToPay() + "$");
        return totalPriceToPay;
    }

}

