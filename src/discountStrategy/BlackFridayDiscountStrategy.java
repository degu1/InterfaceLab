package discountStrategy;

import discountStrategy.DiscountStrategy;
import interfacelab.Clothing;
import interfacelab.Jacket;
import interfacelab.Socks;

public class BlackFridayDiscountStrategy implements DiscountStrategy {

    @Override
    public double priceByDiscount(Clothing clothing) {
        if (clothing instanceof Jacket) {
            return clothing.getBasePrice()* 0.9;
        } else if (clothing instanceof Socks) {
            return clothing.getBasePrice()* 0.8;
        } else {
            return clothing.getBasePrice()* .75;
        }
    }

    @Override
    public String toString() {
        return "BlackFriday discount";
    }
    

}
