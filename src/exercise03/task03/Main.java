package exercise03.task03;

public class Main {
    public static void main(String[] args) {
        Cost cost = new Cost(5, Currency.USD);
        String amountInCurrency = cost.getAmountInCurrency(Currency.ILS);
        System.out.println(amountInCurrency);
    }
}
