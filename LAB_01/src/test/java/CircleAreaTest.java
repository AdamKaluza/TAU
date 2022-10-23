import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CircleAreaTest {
    private CircleArea circleArea;

    @Before
    public void setUp() {
        circleArea = new CircleArea();
    }

    @After
    public void tearDown() {
        circleArea = null;
    }

    @Test
    public void circleAreaTest() {
        double result = circleArea.circleArea(1.2);
        assertEquals(result,12.0,2);
    }

    @Test
    public void circleAreaTestWhenNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> circleArea.circleArea(-1.2));
        assertEquals(exception.getMessage(), "Ratio can't be negative");
    }

}
