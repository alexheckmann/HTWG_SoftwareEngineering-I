package exercise03.task02;

public class Car {
    private String brand;
    private String model;
    private EngineType engineType;
    public int cc;

    public Car(String brand, String model, EngineType engineType, int cc) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.cc = cc;
    }

    public void print() {
        System.out.println("brand: " + this.brand + " model: " + this.model + " engineType: " + this.engineType);
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int calculateTax() {
        return engineType.getTax(this.cc);
    }
}