package mbuzi.petermbuzi.math.computations.commercial_arithmetic;

public class Loss {

    public double lossBuyingSellingPrice(double buying_price, double selling_price) {
        return buying_price - selling_price;
    }

    public double lossPerLossBuyingPrice(double percentage_loss, double buying_price) {
        return (percentage_loss * buying_price) / 100;
    }

    public double perLossLossBuyingPrice(double loss, double buying_price) {
        return (100 * loss) / buying_price;
    }

    public double perLossBuyingSellingPrice(double buying_price, double selling_price) {
        double loss = buying_price - selling_price;
        return (100 * loss) / buying_price;
    }
}
