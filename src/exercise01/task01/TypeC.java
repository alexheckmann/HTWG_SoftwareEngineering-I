package exercise01.task01;

public class TypeC implements IEmployee {
    private int salary;
    private boolean nightShift;
    private static final float BONUS_MULTIPLIER = 1.5f;

    public TypeC(int salary, boolean nightShift) {
        this.salary = salary;
        this.nightShift = nightShift;
    }

    @Override
    public int getSalary() {
        if (nightShift) {
            return (int) (salary * BONUS_MULTIPLIER);
        } else {
            return salary;
        }
    }
}
