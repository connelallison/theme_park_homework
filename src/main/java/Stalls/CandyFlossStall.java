package Stalls;

import Behaviours.ITicketed;
import ThemePark.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {
    private int startingPrice;

    public CandyFlossStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.startingPrice = 420;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public int defaultPrice() {
        return getStartingPrice();
    }

    public int priceFor(Visitor visitor) {
        return getStartingPrice();
    }
}
