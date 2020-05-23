package exercise03.task03;

public enum Currency {
    EUR("Euro", 1),
    USD("US-Dollar", 1.1031),
    RUB("Rubel", 70.243),
    ILS("Shekel", 3.8627);

    String name;
    double conversionRate;

    Currency(String name, double conversionRate) {
        this.name = name;
        this.conversionRate = conversionRate;
    }

}
