package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class Discount {

    public double discountMarkedSellingPrice(double marked_price, double selling_price) {
        return marked_price - selling_price;
    }

    public double discountPerDiscountMarkedPrice(double percentage_discount, double marked_price) {
        return (percentage_discount * marked_price) / 100;
    }

    public double perDiscountDiscountMarkedPrice(double discount, double marked_price) {
        return (100 * discount) / marked_price;
    }

    public double perDiscountMarkedSellingPrice(double marked_price, double selling_price) {
        double discount = marked_price - selling_price;
        return (100 * discount) / marked_price;
    }
}
