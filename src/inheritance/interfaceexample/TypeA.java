package inheritance.interfaceexample;

public class TypeA implements IEmployee {
    private int salary;

    public TypeA(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
