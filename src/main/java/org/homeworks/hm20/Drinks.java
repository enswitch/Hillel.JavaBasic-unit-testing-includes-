package org.homeworks.hm20;

import java.util.List;

public class Drinks {

    private final double PRICE_WATER = 0.90;
    private final double PRICE_TEA = 1.25;
    private final double PRICE_COFFEE = 1.50;
    private final double PRICE_COCA_COLA = 1.10; // IF YOU WANT TO BUY THIS ITEM, PLEASE TYPE FULL ITEM NAME: - "coca_cola".
    private final double PRICE_LEMONADE = 1.90;
    private final double PRICE_MOHITO = 2.25;
    private int orderedDrinksCount = 0;
    private double totalPriceToPay = 0;

    public int getOrderedDrinksCount() {
        return orderedDrinksCount;
    }

    public double getTotalPriceToPay() {
        return totalPriceToPay;
    }

    public double getPRICE_WATER() {
        return PRICE_WATER;
    }

    public double getPRICE_TEA() {
        return PRICE_TEA;
    }

    public double getPRICE_COFFEE() {
        return PRICE_COFFEE;
    }

    public double getPRICE_COCA_COLA() {
        return PRICE_COCA_COLA;
    }

    public double getPRICE_LEMONADE() {
        return PRICE_LEMONADE;
    }

    public double getPRICE_MOHITO() {
        return PRICE_MOHITO;
    }


    public double makeOrder() {
        Drinks drink = new Drinks();
        Order clientOrder = new Order();
        List<DrinksMachine> orderList = clientOrder.addOrder();
        for (int i = 0; i < orderList.size(); i++) {
            switch (orderList.get(i)) {
                case COFFEE: {
                    DrinksMachine.COFFEE.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.COFFEE.name().toLowerCase() + " would be " + drink.getPRICE_COFFEE() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_COFFEE();
                    System.out.println();
                    break;
                }
                case TEA: {
                    DrinksMachine.TEA.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.TEA.name().toLowerCase() + " would be " + drink.getPRICE_TEA() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_TEA();
                    System.out.println();
                    break;
                }
                case LYMONADE: {
                    DrinksMachine.LYMONADE.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.LYMONADE.name().toLowerCase() + " would be " + drink.getPRICE_LEMONADE() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_LEMONADE();
                    System.out.println();
                    break;
                }
                case MOHITO: {
                    DrinksMachine.MOHITO.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.MOHITO.name().toLowerCase() + " would be " + drink.getPRICE_MOHITO() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_MOHITO();
                    System.out.println();
                    break;
                }
                case WATER: {
                    DrinksMachine.WATER.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.WATER.name().toLowerCase() + " would be " + drink.getPRICE_WATER() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_WATER();
                    System.out.println();
                    break;
                }
                case COCA_COLA: {
                    DrinksMachine.COCA_COLA.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.COCA_COLA.name().toLowerCase() + " would be " + drink.getPRICE_COCA_COLA() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPRICE_COCA_COLA();
                    System.out.println();
                    break;
                }
                default:
                    System.out.println("UNKNOWN ITEM!");
            }
        }
        System.out.println("Drinks were bought: " + getOrderedDrinksCount());
        double totalPrice = getTotalPriceToPay();
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        System.out.println("Total price: " + totalPrice + "$");
        return totalPrice;
    }


    public static void main(String[] args) {
        Drinks drink = new Drinks();
        drink.makeOrder();
    }

}

