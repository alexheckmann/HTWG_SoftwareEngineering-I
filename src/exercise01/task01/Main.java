package exercise01.task01;

import org.jetbrains.annotations.NotNull;

public class Main {


    private static int sumSalary(@NotNull IEmployee[] employees) {
        int sum = 0;
        for (IEmployee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void main(String[] args) {
        IEmployee[] employees = new IEmployee[3];
        employees[0] = new TypeA(3600);
        employees[1] = new TypeB(40, 38);
        employees[2] = new TypeC(3600, true);

        int sum = sumSalary(employees);
        System.out.println(sum);
    }

}
