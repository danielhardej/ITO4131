import org.junit.Test;
import static org.junit.Assert.*;

public class ClockDisplayTest {
    @Test
    public void testConstructor() {
        ClockDisplay clock = new ClockDisplay(12, 34, 56);
        assertEquals("12:34:56", clock.getTime());
    }

    @Test
    public void testTimeTick() {
        ClockDisplay clock = new ClockDisplay(12, 34, 56);
        clock.timeTick();
        assertEquals("12:34:57", clock.getTime());
        clock.timeTick();
        assertEquals("12:34:58", clock.getTime());
        clock.timeTick();
        assertEquals("12:34:59", clock.getTime());
        clock.timeTick();
        assertEquals("12:35:00", clock.getTime());
    }

    @Test
    public void testSubtractClock() {
        ClockDisplay clock1 = new ClockDisplay(12, 34, 56);
        ClockDisplay clock2 = new ClockDisplay(11, 23, 45);
        ClockDisplay result = clock1.subtractClock(clock2);
        assertEquals("01:11:11", result.getTime());
    }

    @Test
    public void testTickDown() {
        ClockDisplay clock = new ClockDisplay(12, 34, 56);
        clock.tickDown();
        assertEquals("12:34:55", clock.getTime());
        clock.tickDown();
        assertEquals("12:34:54", clock.getTime());
        clock.tickDown();
        assertEquals("12:34:53", clock.getTime());
        clock.tickDown();
        assertEquals("12:34:52", clock.getTime());
        clock.tickDown();
        assertEquals("12:34:51", clock.getTime());
    }

    @Test
    public void testConstructorWithSeconds() {
        ClockDisplay clock = new ClockDisplay(3661);
        assertEquals("01:01:01", clock.getTime());
    }
}