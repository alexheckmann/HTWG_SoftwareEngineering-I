package exercise01.task01;

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
