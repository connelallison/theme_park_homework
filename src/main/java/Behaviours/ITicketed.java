package Behaviours;

import ThemePark.Visitor;

public interface ITicketed {
    int defaultPrice();

    int priceFor(Visitor visitor);

}
