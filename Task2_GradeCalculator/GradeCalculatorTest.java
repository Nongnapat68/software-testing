import org.junit.Before;

import org.junit.Test;
 
import static org.junit.Assert.*;
 
public class GradeCalculatorTest {
 
    private GradeCalculator calc;
 
    @Before

    public void setUp() {

        calc = new GradeCalculator();

    }
 
    @Test

    public void score90ReturnsA() {

        int score = 90;

        String grade = calc.gradeOf(score);

        assertEquals("A", grade);

    }
 
    @Test

    public void score100ReturnsA() {

        int score = 100;

        String grade = calc.gradeOf(score);

        assertEquals("A", grade);

    }
 
    @Test

    public void score80ReturnsA() {

        int score = 80;

        String grade = calc.gradeOf(score);

        assertEquals("A", grade);

    }
 
    @Test

    public void score77ReturnsBPlus() {

        int score = 77;

        String grade = calc.gradeOf(score);

        assertEquals("B+", grade);

    }
 
    @Test

    public void score79ReturnsBPlus() {

        int score = 79;

        String grade = calc.gradeOf(score);

        assertEquals("B+", grade);

    }
 
    @Test

    public void score75ReturnsBPlus() {

        int score = 75;

        String grade = calc.gradeOf(score);

        assertEquals("B+", grade);

    }
 
    @Test

    public void score72ReturnsB() {

        int score = 72;

        String grade = calc.gradeOf(score);

        assertEquals("B", grade);

    }
 
    @Test

    public void score74ReturnsB() {

        int score = 74;

        String grade = calc.gradeOf(score);

        assertEquals("B", grade);

    }
 
    @Test

    public void score70ReturnsB() {

        int score = 70;

        String grade = calc.gradeOf(score);

        assertEquals("B", grade);

    }
 
    @Test

    public void score67ReturnsCPlus() {

        int score = 67;

        String grade = calc.gradeOf(score);

        assertEquals("C+", grade);

    }
 
    @Test

    public void score69ReturnsCPlus() {

        int score = 69;

        String grade = calc.gradeOf(score);

        assertEquals("C+", grade);

    }
 
    @Test

    public void score65ReturnsCPlus() {

        int score = 65;

        String grade = calc.gradeOf(score);

        assertEquals("C+", grade);

    }
 
    @Test

    public void score62ReturnsC() {

        int score = 62;

        String grade = calc.gradeOf(score);

        assertEquals("C", grade);

    }
 
    @Test

    public void score64ReturnsC() {

        int score = 64;

        String grade = calc.gradeOf(score);

        assertEquals("C", grade);

    }
 
    @Test

    public void score60ReturnsC() {

        int score = 60;

        String grade = calc.gradeOf(score);

        assertEquals("C", grade);

    }
 
    @Test

    public void score57ReturnsDPlus() {

        int score = 57;

        String grade = calc.gradeOf(score);

        assertEquals("D+", grade);

    }
 
    @Test

    public void score59ReturnsDPlus() {

        int score = 59;

        String grade = calc.gradeOf(score);

        assertEquals("D+", grade);

    }
 
    @Test

    public void score55ReturnsDPlus() {

        int score = 55;

        String grade = calc.gradeOf(score);

        assertEquals("D+", grade);

    }
 
    @Test

    public void score52ReturnsD() {

        int score = 52;

        String grade = calc.gradeOf(score);

        assertEquals("D", grade);

    }
 
    @Test

    public void score54ReturnsD() {

        int score = 54;

        String grade = calc.gradeOf(score);

        assertEquals("D", grade);

    }
 
    @Test

    public void score50ReturnsD() {

        int score = 50;

        String grade = calc.gradeOf(score);

        assertEquals("D", grade);

    }
 
    @Test

    public void score25ReturnsF() {

        int score = 25;

        String grade = calc.gradeOf(score);

        assertEquals("F", grade);

    }
 
    @Test

    public void score49ReturnsF() {

        int score = 49;

        String grade = calc.gradeOf(score);

        assertEquals("F", grade);

    }
 
    @Test

    public void score0ReturnsF() {

        int score = 0;

        String grade = calc.gradeOf(score);

        assertEquals("F", grade);

    }
 
    @Test(expected = IllegalArgumentException.class)

    public void scoreMinus50ThrowsException() {

        int score = -50;

        calc.gradeOf(score);

    }
 
    @Test(expected = IllegalArgumentException.class)

    public void score150ThrowsException() {

        int score = 150;

        calc.gradeOf(score);

    }
 
    @Test(expected = IllegalArgumentException.class)

    public void scoreMinus1ThrowsException() {

        int score = -1;

        calc.gradeOf(score);

    }
 
    @Test(expected = IllegalArgumentException.class)

    public void score101ThrowsException() {

        int score = 101;

        calc.gradeOf(score);

    }

}
 