import org.junit.Test;
import static org.junit.Assert.*;

public class program1test {

    @Test
    public void testAdd() {

        program1 obj = new program1(); // create object

        // Test case 1: Positive numbers
        assertEquals(5, obj.add(2, 3));

        // Test case 2: Negative numbers
        assertEquals(-5, obj.add(-3, -3));

        // Test case 3: Mixed numbers
        assertEquals(0, obj.add(-2, 2));

        // Test case 4: Zero
        assertEquals(0, obj.add(0, 0));
    }
}