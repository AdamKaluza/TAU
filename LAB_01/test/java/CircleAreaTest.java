import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        double result = circleArea.circleArea(23);
        assertEquals(result,12.0,2);
    }

}
