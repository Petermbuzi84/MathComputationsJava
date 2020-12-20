package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class SellingPrice {

    public double sellingPriceMarkedPriceDiscount(double marked_price, double discount) {
        return marked_price - discount;
    }

    public double sellingPriceMarkedPricePerDiscount(double marked_price, double percentage_discount) {
        double num = 100 - percentage_discount;
        return (marked_price * num) / 100;
    }

    public double sellingPriceProfitBuyingPrice(double profit, double buying_price) {
        return profit + buying_price;
    }

    public double sellingPriceBuyingPricePerProfit(double buying_price, double percentage_profit) {
        double num = percentage_profit + 100;
        return (buying_price * num) / 100;
    }

    public double sellingPriceBuyingPriceLoss(double buying_price, double loss) {
        return buying_price - loss;
    }

    public double sellingPriceBuyingPricePerLoss(double buying_price, double percentage_loss) {
        double num = 100 - percentage_loss;
        return (buying_price * num) / 100;
    }
}
