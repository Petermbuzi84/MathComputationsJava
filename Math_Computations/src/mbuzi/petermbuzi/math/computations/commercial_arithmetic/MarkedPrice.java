package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class MarkedPrice {

    public double markedPriceDiscountSellingPrice(double discount, double selling_price) {
        return discount + selling_price;
    }

    public double markedPriceDiscountPerDiscount(double discount, double percentage_discount) {
        return (100 * discount) / percentage_discount;
    }

    public double markedPriceSellingPricePerDiscount(double selling_price, double percentage_discount) {
        double den = 100 - percentage_discount;
        return (100 * selling_price) / den;
    }
}
