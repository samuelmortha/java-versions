package samuel.mortha;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class SwitchStringDemoTest {
    @Test
    public void switchTestWithString1(){
        Assert.assertEquals("One",SwitchStringDemo.switchStringDemo("1"));
    }
    @Test
    public void switchTestWithString2(){
        Assert.assertEquals("Two",SwitchStringDemo.switchStringDemo("2"));
    }
    @Test
    public void switchTestWithString3(){
        Assert.assertEquals("Three",SwitchStringDemo.switchStringDemo("3"));
    }
}
