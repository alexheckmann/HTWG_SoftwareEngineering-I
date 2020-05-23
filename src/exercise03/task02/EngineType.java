package exercise03.task02;

public enum EngineType {
    DIESEL("Diesel", "l") {
        int getTax(int cc) {
            return cc * 150;
        }
    },
    PETROL("Benzin", "l") {
        int getTax(int cc) {
            return cc * 50;
        }
    },
    ELECTRIC("Elektrisch", "kWh") {
        int getTax(int cc) {
            return 50;
        }
    };

    String name;
    String consumptionUnit;

    private EngineType(String name, String consumptionUnit) {
        this.name = name;
        this.consumptionUnit = consumptionUnit;
    }

    String getName() {
        return name;
    }

    String getConsumptionUnit() {
        return consumptionUnit;
    }

    abstract int getTax(int var1);
}