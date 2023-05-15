import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

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
