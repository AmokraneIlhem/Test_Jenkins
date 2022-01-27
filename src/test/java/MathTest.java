import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add(int a,int b) {
        Assert.assertEquals(12,Math.add(8,6));

    }
}