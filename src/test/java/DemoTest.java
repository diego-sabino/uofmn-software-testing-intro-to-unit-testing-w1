import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test
    public void testIsTriangle1() {
        assertTrue(Demo.isTriangle(3,5,6));
    }

    @Test
    public void testIsTriangle2() {
        assertTrue(Demo.isTriangle(10,15,16));
    }
    @Test
    public void testIsTriangle3() {
        assertTrue(Demo.isTriangle(7,9,14));
    }
    @Test
    public void testIsTriangle4() {
        assertTrue(Demo.isTriangle(13,15,16));
    }
    @Test
    public void testIsTriangle5() {
        assertTrue(Demo.isTriangle(4,7,10));
    }

    @Test
    public void testIsNotTriangle1() {
        assertFalse(Demo.isTriangle(1,2,3));
    }
    @Test
    public void testIsNotTriangle2() {
        assertFalse(Demo.isTriangle(0,4,7));
    }

    @Test
    public void testIsNotTriangle3() {
        assertFalse(Demo.isTriangle(10,1,7));
    }

    @Test
    public void testIsNotTriangle4() {
        assertFalse(Demo.isTriangle(1,1,3));
    }

    @Test
    public void testIsNotTriangle5() {
        assertFalse(Demo.isTriangle(0, 0, 0));
    }
    @Test
    public void testIsNotTriangle6() {
        assertFalse(Demo.isTriangle(7,2,10));
    }
    @Test
    public void testIsNotTriangle7() {
        assertFalse(Demo.isTriangle(-1,10, 14));
    }


    @Test
    public void mainTestInput() {
        //setup
        String input = "5\n12\n18\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke
        String[] args = {};
        Demo.main(args);

        //expect
        String consoleOut = "Enter side 1: \n";
        consoleOut += "Enter side 2: \n";
        consoleOut += "Enter side 3: \n";
        consoleOut += "This is a triangle.\n";

        assertEquals(consoleOut, out.toString());
    }

}
