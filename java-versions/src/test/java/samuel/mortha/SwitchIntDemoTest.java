package samuel.mortha;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class SwitchIntDemoTest {
    @Test
    public void switchTestWithInt1(){
        Assert.assertEquals("One",SwitchIntDemo.switchIntDemo(1));
    }
    @Test
    public void switchTestWithInt2(){
        Assert.assertEquals("Two",SwitchIntDemo.switchIntDemo(2));
    }
    @Test
    public void switchTestWithInt3(){
        Assert.assertEquals("Three",SwitchIntDemo.switchIntDemo(3));
    }
}
