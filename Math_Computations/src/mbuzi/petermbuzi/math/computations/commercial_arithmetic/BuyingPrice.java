package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class BuyingPrice {

    public double buyingPriceSellingPriceProfit(double selling_price, double profit) {
        return selling_price - profit;
    }

    public double buyingPriceProfitPerProfit(double profit, double percentage_profit) {
        return (100 * profit) / percentage_profit;
    }

    public double buyingPriceSellingPricePerProfit(double selling_price, double percentage_profit) {
        double den = percentage_profit + 100;
        return (100 * selling_price) / den;
    }

    public double buyingPriceLossSellingPrice(double loss, double selling_price) {
        return loss + selling_price;
    }

    public double buyingPriceLossPerLoss(double loss, double percentage_loss) {
        return (100 * loss) / percentage_loss;
    }

    public double buyingPriceSellingPricePerLoss(double selling_price, double percentage_loss) {
        double den = 100 - percentage_loss;
        return (100 * selling_price) / den;
    }

    public double buyingPriceMarkedPricePerDiscountPerProfit(double marked_price, double percentage_discount,double percentage_profit) {
        SellingPrice sp = new SellingPrice();
        double selling_price = sp.sellingPriceMarkedPricePerDiscount(marked_price, percentage_discount);
        BuyingPrice bp = new BuyingPrice();
        return bp.buyingPriceSellingPricePerProfit(selling_price, percentage_profit);
    }
}
