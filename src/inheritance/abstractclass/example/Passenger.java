package inheritance.abstractclass.example;

public class Passenger extends Role {

    public Passenger(String name, int age) {
        super(name, age);
    }

    @Override
    public void getDetails() {
        System.out.println("get flight details");
    }
}
