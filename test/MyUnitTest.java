import static org.junit.Assert.assertEquals;

import data.AdvancedData;
import org.junit.Test;
import controller.action.clock.ClockTick;


public class MyUnitTest {



    @Test
    public void test_something(){
        ClockTick c = new ClockTick();
        boolean legal = c.isLegal(new AdvancedData());
        assertEquals(legal, true);
    }


    @Test
    public void test_something2(){
        ClockTick c = new ClockTick();
        boolean legal = c.isLegal(new AdvancedData());
        assertEquals(legal, false);
    }
}
