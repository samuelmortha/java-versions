package samuel.mortha;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class SwitchDemoTest {
    private SwitchDemo switchDemo;
    @Before
    public void setUp(){
        switchDemo = new SwitchDemo();
    }
    @Test
    public void testSwitchIntOneMonday(){
        Assert.assertEquals("MONDAY", switchDemo.getDayOfWeek(1));
        Assert.assertEquals("ANYDAY", switchDemo.getDayOfWeek(10));
    }
    @Test
    public void testSwitchString(){
        Assert.assertEquals("AM", switchDemo.getPartOfDay("morning"));
        Assert.assertNotEquals("PM1", switchDemo.getPartOfDay("afternoon"));
    }
}