package Attractions;

import Behaviours.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {
    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16){
            return true;
        }
        return false;
    }
}
