package samuel.mortha;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.io.IOException;

public class TryWithResourceDemoTest {
    private TryWithResourceDemo t;
    
    @Before
    public void setUp(){
        t = new TryWithResourceDemo();
    }
    @Test
    public void trytWithResourcePathTest() throws IOException{
        Assert.assertEquals("123",t.tryWithResource("/home/ec2-user/environment/work/github/java-versions/java-versions/src/test/resources/simple.txt"));
    }
    @Test
    public void trytWithResourcePathFailTest() throws IOException{
        Assert.assertNotEquals("1234",t.tryWithResource("/home/ec2-user/environment/work/github/java-versions/java-versions/src/test/resources/simple.txt"));
    }
}
