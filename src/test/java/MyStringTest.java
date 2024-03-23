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

    }
}
