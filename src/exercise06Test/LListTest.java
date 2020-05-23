package exercise06Test;

import exercise06.task01.LList;
import exercise06.task01.Student;
import org.junit.Test;

public class LListTest {

    @Test
    public void testGet() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");

        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_indexTooBig() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");

        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.get(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_indexTooSmall() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");


        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.get(-1);
    }

    @Test
    public void testPut() {

        Student studentA = new Student("Max", "Mustermann");

        LList<Student> students = new LList<>();

        students.insert(studentA);


        students.put(0, studentA);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPut_indexTooBig() {

        Student studentA = new Student("Max", "Mustermann");

        LList<Student> students = new LList<>();
        students.insert(studentA);


        students.put(1, studentA);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPut_indexTooSmall() {

        Student studentA = new Student("Max", "Mustermann");

        LList<Student> students = new LList<>();
        students.insert(studentA);


        students.put(-1, studentA);
    }

    @Test
    public void testRemove() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");


        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_emptyList() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");

        LList<Student> students = new LList<>();


        students.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexTooBig() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");


        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.remove(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_indexTooSmall() {

        Student studentA = new Student("Max", "Mustermann");
        Student studentB = new Student("Peter", "Maier");


        LList<Student> students = new LList<>();

        students.insert(studentA);
        students.insert(studentB);


        students.remove(-1);
    }

}