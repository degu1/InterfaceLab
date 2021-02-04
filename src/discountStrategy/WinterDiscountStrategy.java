package discountStrategy;

import discountStrategy.DiscountStrategy;
import interfacelab.Clothing;
import interfacelab.Jacket;
import utility.Season;

public class WinterDiscountStrategy implements DiscountStrategy {

    @Override
    public double priceByDiscount(Clothing clothing) {
        double price = clothing.getBasePrice();

        if (clothing.getSeason().equals(Season.AUTUMN)) {
            price = price * 0.6;
        } else if (clothing.getSeason().equals(Season.WINTER)) {
            price = price * 0.5;
        } else if (clothing.getSeason().equals(Season.SUMMER)) {
            price = price * 0.75;
        }
        if (clothing instanceof Jacket) {
            price = price * 0.9;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Winter discount";
    }

}
