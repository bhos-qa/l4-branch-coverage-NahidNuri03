package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    public void testAdd() {
        MyClass myClass = new MyClass();
        assertEquals(5, myClass.add(2, 3));
    }

    @Test
    public void testConcatenateStrings() {
        MyClass myClass = new MyClass();
        assertEquals("Hello, World!", myClass.concatenateStrings("Hello, ", "World!"));
    }

    @Test
    public void testIsEven() {
        MyClass myClass = new MyClass();
        assertTrue(myClass.isEven(4));
        assertFalse(myClass.isEven(7));
    }

    @Test
    public void testFindMax() {
        MyClass myClass = new MyClass();
        int[] numbers = {1, 7, 3, 9, 2};
        assertEquals(9, myClass.findMax(numbers));
    }

    @Test
    public void testCalculateAverage() {
        MyClass myClass = new MyClass();
        double[] values = {2.5, 3.0, 1.5, 4.0};
        assertEquals(2.75, myClass.calculateAverage(values), 0.001);
    }
}
