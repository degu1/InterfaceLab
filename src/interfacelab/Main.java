package interfacelab;

import utility.Season;
import discountStrategy.SummerDiscountStrategy;

public class Main {

    public static void main(String[] args) {

        Jacket linenCoat = new Jacket("Linen Coat", Season.SUMMER, 100000);
        linenCoat.setDiscountStrategy(new SummerDiscountStrategy());
        System.out.println(linenCoat);
        linenCoat.setDiscountStrategy(null);
        System.out.println(linenCoat);

    }
}
