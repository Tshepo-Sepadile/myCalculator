package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class AppConfigTest {
    private myCalculator calcu;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calcu = (myCalculator)ctx.getBean("calcu");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testsquare() {

        int result = calcu.square(3);
        Assert.assertEquals("Square of 3 is 9", 9, result);
    }
}