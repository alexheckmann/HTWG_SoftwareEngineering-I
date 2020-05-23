package exercise03.task03;

public class Cost {
    private double amount;
    private Currency currency;

    public Cost(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getAmountInCurrency(Currency currency) {
        double conversion = (amount / this.currency.conversionRate) * currency.conversionRate;
        String amount = "It's worth " + Double.toString(conversion) + " " + currency.name;
        return amount;
    }
}