package Stalls;

import Behaviours.ISecurity;
import Behaviours.ITicketed;
import ThemePark.Visitor;

public class WhiskyStall extends Stall implements ISecurity, ITicketed {
    private int startingPrice;

    public WhiskyStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.startingPrice = 660;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

        public int defaultPrice() {
            return getStartingPrice();
        }

        public int priceFor(Visitor visitor) {
            return getStartingPrice();
        }
}
