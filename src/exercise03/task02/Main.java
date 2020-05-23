package exercise03.task02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A4", EngineType.DIESEL, 2);
        int tax = car.calculateTax();
        System.out.println(car.getEngineType().getName() + " : " + tax);
        System.out.println("///////");
        EngineType[] var6;
        int var5 = (var6 = EngineType.values()).length;

        EngineType desiredType;
        for (int var4 = 0; var4 < var5; ++var4) {
            desiredType = var6[var4];
            System.out.println(desiredType.getName());
        }

        System.out.println("///////");
        desiredType = EngineType.valueOf("DIESEL");
        System.out.println(desiredType.getName());
    }
}
