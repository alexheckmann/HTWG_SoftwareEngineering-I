package exercise06.task01;

public class Main {

    public static void main(String[] args) {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");
        Student studentC = new Student("Max", "Maier");

        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);
        students.insert(studentC);


        //students.put(1, studentC);


        System.out.println("Does the list contain the item?: " + students.contains(studentC));

        System.out.println("students' size: " + students.size());


        //System.out.println(students.get(1).toString());
        Student student = null;


        //student = students.get(1);


        //System.out.println("Student index 0: " + student.toString());
        for (Student s:students) {
            System.out.println(s.toString());
        }
        System.out.println("----------------------");

        if (students.remove(studentC)) {
            System.out.println("Erfolgreich");
        }

        System.out.println("students' size: " + students.size());

        for (Student s:students) {
            System.out.println(s.toString());
        }
/*
        students.insert(3, studentC);
        System.out.println("student's size: " + students.size());
        System.out.println(students.remove(studentC));
        System.out.println("student's size: " + students.size());
        System.out.println("student's size: " + students.size());
        student = (Student) students.get(1);
        System.out.println("Student index 2: " + student.getName() + " " + student.getSurname());
*/
    }
}
