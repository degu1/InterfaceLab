package discountStrategy;

import discountStrategy.DiscountStrategy;
import interfacelab.Clothing;
import utility.Season;

public class SummerDiscountStrategy implements DiscountStrategy {

    @Override
    public double priceByDiscount(Clothing clothing) {
        if (clothing.getSeason().equals(Season.SPRING)) {
            return clothing.getBasePrice()* 0.6;
        } else if (clothing.getSeason().equals(Season.SUMMER)) {
            return clothing.getBasePrice()* 0.5;
        } else if (clothing.getSeason().equals(Season.WINTER)) {
            return clothing.getBasePrice()* 0.7;
        } else {
        return clothing.getBasePrice();
        }
    }

    @Override
    public String toString() {
        return "Summer discount";
    }
    
    
}
