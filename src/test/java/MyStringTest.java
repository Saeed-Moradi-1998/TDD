import org.example.MyString;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyStringTest {

    MyString myString = new MyString();
    @Test
    public void testIndexOfString() {
        // This now passes in case s2 is empty.
        assertEquals(-1, MyString.indexOfString("world", "", 0));
        // This now passes in case s1 is empty.
        assertEquals(-1, MyString.indexOfString("", "world", 0));
        // This test case now passes as the method indexOfString handles it.
        assertEquals(6, MyString.indexOfString("hello world", "world", 0));
        // This test case now passes as the initial return value of the method indexOfString has changed from 0 to -1.
        assertEquals(-1, MyString.indexOfString("hello world", "world", 10));

        assertEquals(5, MyString.indexOfString("worldworld", "world", 3));
        // Further testing other possible cases.
        assertEquals(-1, MyString.indexOfString("hello World", "world", 0));
    }

    @Test
    public void testReplace() { // Testing the method replace.

        assertEquals(null,myString.replace(null, "hello", "world"));
        // This test now successfully passes because the case where s is null is handled.
        assertEquals(null,myString.replace("hello world", null, "world"));
        // This test case now successfully passes.
        assertEquals(null,myString.replace("hello world", "hello", null));
        // This test case now successfully passes.
        assertEquals("world",myString.replace("hello world", "", "world"));
        // This test case now successfully passes.
        assertEquals("Hello Saeed",myString.replace("Hello world", "world", "Saeed"));
        // This test case now successfully passes.

    }
}
