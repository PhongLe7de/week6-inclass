import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TimeCalTest {
    @Test
    public void calTime (){
        assertEquals(2,TimeCal.calTime(100,50),0.0001);
    }

}