package org.homeworks.hm20;

public enum DrinksMachine implements MakeDrinks {


    COFFEE(1.50) {
        @Override
        public void makeDrink() {
            System.out.println("To make coffee you need: coffee, water, milk and sugar by choice");
        }
    },
    TEA(1.25) {
        @Override
        public void makeDrink() {
            System.out.println("To make tea you need: a stick of tea, water, sugar by choice");
        }
    },
    LYMONADE(1.90) {
        @Override
        public void makeDrink() {
            System.out.println("To make lymonade you need: water, syrup, mint, lemon, sugar");
        }
    },
    MOHITO(2.25) {
        @Override
        public void makeDrink() {
            System.out.println("To make mohito you need: sprite, lime, mint, sugar and ice by choice");
        }
    },
    WATER(0.90) {
        @Override
        public void makeDrink() {
            System.out.println("You just need to buy a bottle of water");
        }
    },
    COCA_COLA(1.10) {
        @Override
        public void makeDrink() {
            System.out.println("You just need to buy a bottle of coke");
        }
    };
    private final double priceDrink;

    DrinksMachine(double priceDrink) {
        this.priceDrink = priceDrink;
    }

    public double getPriceDrink() {
        return priceDrink;
    }
}

