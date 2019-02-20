import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class with tests for the class TimeStamp
 *
 * @author  (Irini Cazoniere)
 * @version (20.02.2019)
 */
public class TimeStampTest
{
    private TimeStamp end = new TimeStamp(4);
    private TimeStamp start = new TimeStamp(2);
    

    /**
     * Default constructor for test class TimeStampTest
     */
    public TimeStampTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testEqualTo()
    {
        /*
         * This is an example of how you can write tests.
         * Just call "assertEquals" with 2 arguments:
         *   - The exprected value
         *   - The actual value
         * which will look like this:
         * assertEquals(expectedExpression, actualExpression);
         * to check that actualExpression evaluates to the same
         * value as expectedExpression.
         *
         * This is very similar to the function check-expect in Racket.
         * There you would write:
         * (check-expect actual-expression expected-expression)
         * to check that actual-expression evaluates to the same
         * value as expected-expression.
         *
         * We placed calls to check-expect at the top-level of a program.
         * Here, calls to assertEquals are placed inside melhods of a JUnit
         * test Class.
         *
         * The testing methods are already ready below. You just have to
         * write the assertEquals calls.
         */
        assertEquals(false, end.equalTo(start));
        
        TimeStamp t = new TimeStamp(2);
        assertEquals(true, t.equalTo(start));
    }

    @Test
    public void testAfter()
    {
        assertEquals(true, end.after(start));
        TimeStamp t =  new TimeStamp(8);
        assertEquals(false, end.after(t));
    }

    @Test
    public void testBefore()
    {
        assertEquals(true, end.after(start));
        TimeStamp r =  new TimeStamp(8);
        assertEquals(false, end.after(r));
    }

    @Test 
    public void testGetDurationUntil()
    {
        TimeStamp w =  new TimeStamp(8);
        assertEquals( 4, w.getDurationUntil(end));
        assertEquals( 6, w.getDurationUntil(start));
        
        assertEquals(-2, start.getDurationUntil(end));
        assertEquals(2, end.getDurationUntil(start));
        
        
        
        
    }

    @Test
    public void testGetLater()
    {
        assertEquals(true,end.after(start));
        assertEquals(false, start.after(end));
    }

    @Test
    public void testGetEarlier()
    {
        assertEquals(true, start.before(end));
        assertEquals(false, end.before(start));
    }
}


