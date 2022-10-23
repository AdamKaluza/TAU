import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BinomialCoefficientTest {
    private BinomialCoefficient binomialCoefficient;

    @Before
    public void setUp() {
        binomialCoefficient = new BinomialCoefficient();
    }

    @After
    public void tearDown() {
        binomialCoefficient = null;
    }

    @Test
    public void binomialCoefficientTestWhenOK() {
        long result = binomialCoefficient.binomialCoefficient(4, 2);
        assertEquals(6, result);
    }

    @Test
    public void binomialCoefficientTestWhenNEqualK() {
        long result = binomialCoefficient.binomialCoefficient(20, 20);
        assertEquals(1, result);
    }

    @Test
    public void binomialCoefficientTestWhenKAndNEqual0() {
        long result = binomialCoefficient.binomialCoefficient(0, 0);
        assertEquals(1, result);
    }

    @Test
    public void binomialCoefficientTestWhenKIsBiggerThanN() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> binomialCoefficient.binomialCoefficient(2, 4));
        assertEquals(exception.getMessage(), "K must be bigger than N");
    }

    @Test
    public void binomialCoefficientWhenKIsNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> binomialCoefficient.binomialCoefficient(-4, 2));
        assertEquals(exception.getMessage(), "Value can't be negative");
    }

    @Test
    public void binomialCoefficientWhenNIsNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> binomialCoefficient.binomialCoefficient(5, -2));
        assertEquals(exception.getMessage(), "Value can't be negative");
    }
}
