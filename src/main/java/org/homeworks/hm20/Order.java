package org.homeworks.hm20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private static int orderedDrinksCount = 0;
    private static double totalPriceToPay = 0;
    private static List<DrinksMachine> clientOrderList = new ArrayList<>();

    public static int getOrderedDrinksCount() {
        return orderedDrinksCount;
    }

    public static double getTotalPriceToPay() {
        return totalPriceToPay;
    }

    public static List<DrinksMachine> getClientOrderList() {
        return clientOrderList;
    }

    public void showMenu() {
        Drinks item = new Drinks();
        System.out.println("MENU: " + '\n' +
                DrinksMachine.WATER.name() + ": " + item.getPriceWater() + "$" + '\n' +
                DrinksMachine.COCA_COLA.name() + ": " + item.getPriceCoca_Cola() + "$" + '\n' +
                DrinksMachine.TEA.name() + ": " + item.getPriceTea() + "$" + '\n' +
                DrinksMachine.COFFEE.name() + ": " + item.getPriceCoffee() + "$" + '\n' +
                DrinksMachine.LEMONADE.name() + ": " + item.getPriceLemonade() + "$" + '\n' +
                DrinksMachine.MOHITO.name() + ": " + item.getPriceMohito() + "$" + '\n' + '\n' +
                "To select drink, please type name of drink in lower case mode in console" + '\n' +
                "To finish order, please type command 'finish' in console");
        System.out.println();
    }


    public List createOrder() {

        String clientRequest = null;
        System.out.println("Welcome, what do you want to drink?");
        do {
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextLine()) {
                clientRequest = scan.nextLine();
                if (clientRequest.equals("finish")) {
                    break;
                } else {
                    try {
                        String clientRequestTransform = clientRequest.toUpperCase();
                        DrinksMachine clientOrder = DrinksMachine.valueOf(clientRequestTransform);

                        for (int i = 0; i < DrinksMachine.values().length; i++) {
                            if (clientOrder.equals(DrinksMachine.values()[i])) {
                                clientOrderList.add(clientOrder);
                            }
                        }
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Wrong item to buy!");
                    }
                }
            }
        } while (!clientRequest.equals("finish"));
        System.out.println("Your order: " + getClientOrderList());
        return getClientOrderList();
    }


    public double printOrder() {
        Drinks drink = new Drinks();
        for (DrinksMachine i: clientOrderList) {
            switch (i) {
                case COFFEE: {
                    DrinksMachine.COFFEE.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.COFFEE.name().toLowerCase() + " would be " + drink.getPriceCoffee() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceCoffee();
                    System.out.println();
                    break;
                }
                case TEA: {
                    DrinksMachine.TEA.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.TEA.name().toLowerCase() + " would be " + drink.getPriceTea() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceTea();
                    System.out.println();
                    break;
                }
                case LEMONADE: {
                    DrinksMachine.LEMONADE.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.LEMONADE.name().toLowerCase() + " would be " + drink.getPriceLemonade() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceLemonade();
                    System.out.println();
                    break;
                }
                case MOHITO: {
                    DrinksMachine.MOHITO.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.MOHITO.name().toLowerCase() + " would be " + drink.getPriceMohito() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceMohito();
                    System.out.println();
                    break;
                }
                case WATER: {
                    DrinksMachine.WATER.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.WATER.name().toLowerCase() + " would be " + drink.getPriceWater() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceWater();
                    System.out.println();
                    break;
                }
                case COCA_COLA: {
                    DrinksMachine.COCA_COLA.makeDrink();
                    System.out.println("The price for a " + DrinksMachine.COCA_COLA.name().toLowerCase() + " would be " + drink.getPriceCoca_Cola() + "$");
                    orderedDrinksCount++;
                    totalPriceToPay += drink.getPriceCoca_Cola();
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
        Order order = new Order();
        order.showMenu();
        order.createOrder();
        order.printOrder();

    }
}
