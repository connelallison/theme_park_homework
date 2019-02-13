package ThemePark;

import Attractions.Attraction;
import Behaviours.IReviewed;
import Behaviours.ISecurity;
import Behaviours.ITicketed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<Visitor> visitors;
    private ArrayList<IReviewed> reviews;
    private ArrayList<ITicketed> ticketeds;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.visitors = new ArrayList<Visitor>();
        this.reviews = new ArrayList<IReviewed>();
        this.ticketeds = new ArrayList<ITicketed>();
    }

    public ArrayList<ITicketed> getAllAllowedFor(Visitor visitor) {
        ArrayList<ITicketed> allowed = new ArrayList<ITicketed>();
        for (int i = 0; i < ticketeds.size(); i++) {
            if (ticketeds.get(i) instanceof ISecurity){
                if (((ISecurity) ticketeds.get(i)).isAllowedTo(visitor)){
                    allowed.add(ticketeds.get(i));
                }
            } else {
                allowed.add(ticketeds.get(i));

            }
        }
        return allowed;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return reviews;
    }

    public String visit (Visitor visitor, Attraction attraction){
        if (attraction instanceof ISecurity){
            if (!((ISecurity) attraction).isAllowedTo(visitor)){
                return "Access Denied.";
            }
        }
        if (attraction instanceof ITicketed){
            if (!visitor.canAfford(((ITicketed) attraction).priceFor(visitor))){
                return "Insufficient Funds.";
            }
        }
        return "Yay";
    }

    public String getReviews(){
        String reviewString = "";
        for (int i = 0; i < reviews.size()-1; i++) {
            reviewString += (reviews.get(i).getName() + ": " + reviews.get(i).getRating() + ", ");
        }
        reviewString += (reviews.get(reviews.size()-1).getName() + ": " + reviews.get(reviews.size()-1).getRating());
        return reviewString;
    }

}
