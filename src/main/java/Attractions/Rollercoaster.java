package Attractions;

import Behaviours.ISecurity;
import Behaviours.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {
    private int topSpeed;
    private int startingPrice;

    public Rollercoaster(String name, int topSpeed, int rating) {
        super(name, rating);
        this.topSpeed = topSpeed;
        this.startingPrice = 840;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        }
        return false;
    }

    public int defaultPrice() {
        return startingPrice;
    }

    public int priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
