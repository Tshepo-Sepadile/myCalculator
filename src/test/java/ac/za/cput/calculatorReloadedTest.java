package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorReloadedTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void square() {
        myCalculator calc = new calculatorReloaded();
        int result = calc.square(10);
        Assert.assertEquals("The square of 10", 100, result);
    }
}