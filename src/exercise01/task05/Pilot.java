package exercise01.task05;

public class Pilot extends Passenger {
    public Pilot(String name, int age) {
        super(name, age);
    }

    public void cancelFlight() {
        System.out.println("cancelling flight");
    }
}
