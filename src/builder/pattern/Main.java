package builder.pattern;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setManufacturer("Abarth")
                .setModel("595")
                .setModelVersion("C")
                .build();

        System.out.printf("%s %s %s", car.getManufacturer(), car.getModel(), car.getModelVersion());
    }
}
