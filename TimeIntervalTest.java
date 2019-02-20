import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TimeIntervalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TimeIntervalTest
{
    TimeStamp t1 = new TimeStamp(1);
    TimeStamp t2 = new TimeStamp(2);
    TimeStamp t3 = new TimeStamp(3);
    TimeStamp t4 = new TimeStamp(4);
    TimeStamp t5 = new TimeStamp(5);
    TimeStamp t7 = new TimeStamp(7);

                                                  // 012345678
    TimeInterval i13 = new TimeInterval(t1, t3);  //  TT.
    TimeInterval i27 = new TimeInterval(t2, t7);  //   TTTTT.
    TimeInterval i37 = new TimeInterval(t3, t7);  //    TTTT.
    TimeInterval i47 = new TimeInterval(t4, t7);  //     TTT.
    TimeInterval i57 = new TimeInterval(t5, t7);  //      TT.

    /**
     * Default constructor for test class TimeIntervalTest
     */
    public TimeIntervalTest()
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
    public void testBefore()
    {
        // does interval i13 happen before interval i27?
        assertEquals(false, i13.before(i27));
        // does interval i13 happen before interval i37?
        assertEquals(false, i13.before(i37));
        // does interval i13 happen before interval i47?
        assertEquals(true, i13.before(i47));
        // does interval i13 happen before interval i57?
        assertEquals(true, i13.before(i57));
    }
}
