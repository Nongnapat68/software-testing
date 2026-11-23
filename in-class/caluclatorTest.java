import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class caluclatorTest {

    private calculator obj;

    @Before
    public void setUp() {
        obj = new calculator();
    }

    @Test
    public void test01TwoAddThree() { // a = 2 b = 3 addnumber (2+3) == expected result 5
        assertEquals(5, obj.addNumber(2, 3));
    }

    @Test
    public void test02() { // a = 5 b = 5 addnumber (5+5) == expected result 10
        assertEquals(10, obj.addNumber(5, 5));
    }

    @Test
    public void test03DivideSixThree() {
        assertEquals(2, obj.divideNumber(6, 3));
    }

    @Test
    public void test04DivideTenTwo() {
        assertEquals(5, obj.divideNumber(10, 2));
    }

}