package Attractions;

import Behaviours.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {
    private int capacity;
    private int startingPrice;


        public Dodgems(String name, int capacity, int rating) {
            super(name, rating);
            this.capacity = capacity;
            this.startingPrice = 450;
        }


        public int getCapacity() {
            return capacity;
        }

    public int getStartingPrice() {
        return startingPrice;
    }

    public int defaultPrice() {
        return getStartingPrice();
    }

    public int priceFor(Visitor visitor) {
            if (visitor.getAge() < 12){
                return defaultPrice()/2;
            }
        return defaultPrice();
    }
}
