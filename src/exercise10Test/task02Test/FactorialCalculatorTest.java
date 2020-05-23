package exercise10Test.task02Test;

import exercise10.task02.FactorialCalculator;
import exercise10.task02.NotANaturalNumberException;
import exercise10.task02.NumberTooBigException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void faculty_zero() throws NotANaturalNumberException, NumberTooBigException {

        FactorialCalculator factorialCalculator = new FactorialCalculator();


        long faculty = factorialCalculator.faculty(0);


        assertEquals(1, faculty);
    }

    @Test
    public void faculty_positiveNumber() throws NotANaturalNumberException, NumberTooBigException {

        FactorialCalculator factorialCalculator = new FactorialCalculator();


        long faculty = factorialCalculator.faculty(4);


        assertEquals(24, faculty);
    }

    @Test(expected = NotANaturalNumberException.class)
    public void faculty_negativeNumber() throws NotANaturalNumberException, NumberTooBigException {

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        long faculty = factorialCalculator.faculty(-1);
    }

    @Test(expected = NumberTooBigException.class)
    public void faculty_numberTooBig() throws NotANaturalNumberException, NumberTooBigException {

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        long faculty = factorialCalculator.faculty(21);
    }
}