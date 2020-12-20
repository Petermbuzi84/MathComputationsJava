package mbuzi.petermbuzi.math.computations;

public class ExchangeRates {

    public double localExchangeValue(double local_currency_value, double foreign_amount_to_be_exchanged, double foreign_comparison) {
        return (local_currency_value * foreign_amount_to_be_exchanged) / foreign_comparison;
    }

    public double foreignAmountToBeExchanged(double local_exchange_value, double foreign_comparison, double local_currency_value) {
        return (local_exchange_value * foreign_comparison) / local_currency_value;
    }

    public double localCurrencyValue(double local_exchange_value, double foreign_comparison, double foreign_amount_to_be_exchanged) {
        return (local_exchange_value * foreign_amount_to_be_exchanged) / foreign_comparison;
    }

    public double foreignComparison(double local_exchange_value, double foreign_amount_to_be_exchanged, double local_currency_value) {
        return (foreign_amount_to_be_exchanged * local_currency_value) / local_exchange_value;
    }
}
