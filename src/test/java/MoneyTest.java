import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by YDNPC on 14/11/2015.
 */
public class MoneyTest {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
