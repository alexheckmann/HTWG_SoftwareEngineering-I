package exercise01.task05;

public class CrewMember extends Passenger {

    public CrewMember(String name, int age) {
        super(name, age);
    }

    public void seePassengerList() {
        System.out.println("Passengers aboard: all");
    }
}
