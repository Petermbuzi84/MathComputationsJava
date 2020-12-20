package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class Profit {

    public double profitBuyingSellingPrice(double buying_price, double selling_price) {
        return selling_price - buying_price;
    }

    public double profitPerProfitBuyingPrice(double percentage_profit, double buying_price) {
        return (percentage_profit * buying_price) / 100;
    }

    public double perProfitProfitBuyingPrice(double percentage_profit, double buying_price) {
        return (100 * percentage_profit) / buying_price;
    }

    public double perProfitBuyingSellingPrice(double buying_price, double selling_price) {
        double profit = selling_price - buying_price;
        return (100 * profit) / buying_price;
    }
}
