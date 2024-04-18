package studentgrade;
/*no need for the TestCase import*/
/*New imports*/
import org.junit.Assert;
import org.junit.Test;

/* JUnit 4.13.2 */
/* no need to extend TestCase */
public class StudentGradeTest {
    
    /* Use @Test annotation */
    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }
}