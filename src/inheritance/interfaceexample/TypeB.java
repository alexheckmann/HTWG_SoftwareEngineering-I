package inheritance.interfaceexample;

public class TypeB implements IEmployee {

    public int salaryPerHour;
    private int hours;

    public TypeB(int salaryPerHour, int hoursWorked) {
        this.salaryPerHour = salaryPerHour;
        this.hours = hoursWorked;
    }

    public int getSalary() {
        return (salaryPerHour * hours);
    }
}
