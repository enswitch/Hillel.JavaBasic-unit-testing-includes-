package org.homeworks.hm20;

public enum DrinksMachine implements MakeDrinks {


    COFFEE() {
        @Override
        public void makeDrink() {
            System.out.println("To make coffee you need: coffee, water, milk and sugar by choice");
        }
    },
    TEA() {
        @Override
        public void makeDrink() {
            System.out.println("To make tea you need: a stick of tea, water, sugar by choice");
        }
    },
    LYMONADE() {
        @Override
        public void makeDrink() {
            System.out.println("To make lymonade you need: water, syrup, mint, lemon, sugar");
        }
    },
    MOHITO() {
        @Override
        public void makeDrink() {
            System.out.println("To make mohito you need: sprite, lime, mint, sugar and ice by choice");
        }
    },
    WATER() {
        @Override
        public void makeDrink() {
            System.out.println("You just need to buy a bottle of water");
        }
    },
    COCA_COLA() {
        @Override
        public void makeDrink() {
            System.out.println("You just need to buy a bottle of coke");
        }
    }
}

