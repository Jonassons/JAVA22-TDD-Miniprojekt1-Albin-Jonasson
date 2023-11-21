package test;



import org.junit.jupiter.api.Test;

import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TriangleTest {

    @Test
    public void test3rdSmaller() {
        Triangle triangle = new Triangle(1, 2, 10);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void test3rdSmaller1() {
        Triangle triangle = new Triangle(2, 1, 10);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void test3rdSmaller2() {
        Triangle triangle = new Triangle(10, 20, 50);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void test3rdSmaller3() {
        Triangle triangle = new Triangle(5, 5, 10);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void test3rdSmaller4() {
        Triangle triangle = new Triangle(7, 8, 15);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void test3rdSmaller5() {
        Triangle triangle = new Triangle(3, 3, 2);
        assertNull(triangle.getCurrent_type());
    }
    
    @Test
    public void testEquilateral() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertEquals(Triangle.TYPE.EQUILATERAL, triangle.getCurrent_type());
    }

    @Test
    public void testIncorrectNumberOfInts() {
        Triangle triangle = new Triangle(new String[]{"1", "2"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testIncorrectNumberOfInts1() {
        Triangle triangle = new Triangle(new String[]{"1", "2", "3", "4"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testIsosceles() {
        Triangle triangle = new Triangle(5, 5, 8);
        assertEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }

    @Test
    public void testIsosceles1() {
        Triangle triangle = new Triangle(5, 8, 5);
        assertEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }

    @Test
    public void testIsosceles2() {
        Triangle triangle = new Triangle(8, 5, 5);
        assertEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }
    @Test
    public void testNoneInt() {
        Triangle triangle = new Triangle(new String[]{"a", "2", "3"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt1() {
        Triangle triangle = new Triangle(new String[]{"1", "b", "3"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt2() {
        Triangle triangle = new Triangle(new String[]{"1", "2", "c"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt3() {
        Triangle triangle = new Triangle(new String[]{"1.5", "2", "3"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt4() {
        Triangle triangle = new Triangle(new String[]{"1", "2.5", "3"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt5() {
        Triangle triangle = new Triangle(new String[]{"1", "2", "3.8"});
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNoneInt6() {
        Triangle triangle = new Triangle(new String[]{"1.1", "2.2", "3.3"});
        assertNull(triangle.getCurrent_type());
    }
    @Test
    public void testNotIsosceles() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertNotEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }

    @Test
    public void testNotIsosceles1() {
        Triangle triangle = new Triangle(6, 7, 8);
        assertNotEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }

    @Test
    public void testNotIsosceles2() {
        Triangle triangle = new Triangle(10, 11, 12);
        assertNotEquals(Triangle.TYPE.ISOSCELES, triangle.getCurrent_type());
    }
    @Test
    public void testNotTriangle() {
        Triangle triangle = new Triangle(1, 2, 5);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle1() {
        Triangle triangle = new Triangle(7, 3, 2);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle2() {
        Triangle triangle = new Triangle(1, 1, 2);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle3() {
        Triangle triangle = new Triangle(1, 2, 1);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle4() {
        Triangle triangle = new Triangle(2, 1, 1);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle5() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle6() {
        Triangle triangle = new Triangle(3, 4, 7);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle7() {
        Triangle triangle = new Triangle(-3, -4, -5);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle8() {
        Triangle triangle = new Triangle(5, 5, 11);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle9() {
        Triangle triangle = new Triangle(10, 1, 1);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle10() {
        Triangle triangle = new Triangle(1, 10, 1);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle11() {
        Triangle triangle = new Triangle(1, 1, 10);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle12() {
        Triangle triangle = new Triangle(2, 3, 6);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testNotTriangle13() {
        Triangle triangle = new Triangle(1000, 1000, 1001);
        assertNull(triangle.getCurrent_type());
    }

    @Test
    public void testScalene() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(Triangle.TYPE.SCALENE, triangle.getCurrent_type());
    }
    @Test
    public void testGetUserInputValid() {
        // Provide mocked input to simulate user entry
        String input = "3,4,5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Triangle triangle = new Triangle();
        triangle.getUserInput();

        assertEquals(Triangle.TYPE.SCALENE, triangle.getCurrent_type());

        // Reset System.in for subsequent tests
        System.setIn(System.in);
    }
    @Test
    public void testDefaultConstructor() {
        Triangle triangle = new Triangle();
        assertNotNull(triangle);
        assertNull(triangle.getCurrent_type());
    }
    @Test
    public void testGetUserInputInvalidInput() {
        // Provide invalid input to simulate user entry
        String input = "1,2\n"; // Invalid input (less than 3 sides)
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Triangle triangle = new Triangle();
        triangle.getUserInput();

        assertNull(triangle.getCurrent_type());

        // Reset System.in for subsequent tests
        System.setIn(System.in);
    }
}




