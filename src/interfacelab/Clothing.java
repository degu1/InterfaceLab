package interfacelab;

import utility.Season;
import discountStrategy.DiscountStrategy;

public class Clothing {

    String name;
    Season season;
    double basePrice;
    DiscountStrategy discountStrategy;

    public Clothing(String name, Season season, double basePrice) {
        this.name = name;
        this.season = season;
        this.basePrice = basePrice;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        if (discountStrategy != null) {
            return discountStrategy.priceByDiscount(this);
        } else {
            return basePrice;
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        if (discountStrategy != null) {
            return discountStrategy + " " + name + " " + season + ", Price " + getPrice();
        } else {
            return name + " " + season + ", Price " + getPrice();
        }

    }

}
