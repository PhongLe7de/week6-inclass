import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeCalTest {
    TimeCal timeCal = new TimeCal();
    @Test
    public void calTime (){
        timeCal.calTime(100,50);
        assertEquals(2,timeCal.calTime(100,50));
    }

}