package org.homeworks.hm20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    public List addOrder() {  // TO FINISH YOUR ORDER, PLEASE TYPE "FINISH"
        List<DrinksMachine> clientOrderList = new ArrayList<>();
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

                        DrinksMachine[] drinkItemsToBuy = DrinksMachine.values();

                        for (int i = 0; i < drinkItemsToBuy.length; i++) {
                            if (clientOrder.equals(drinkItemsToBuy[i])) {
                                clientOrderList.add(clientOrder);
                            }
                        }
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Wrong item to buy!");
                    }
                }
            }
        } while (!clientRequest.equals("finish"));
        System.out.println("Your order: " + clientOrderList);
        return clientOrderList;
    }
}
