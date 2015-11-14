import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by YDNPC on 14/11/2015.
 */
public class MoneyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void tesFranctMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals( new Dollar(5)));
        assertFalse(new Dollar(5).equals( new Dollar(7)));
        assertTrue(new Franc(5).equals( new Franc(5)));
        assertFalse(new Franc(5).equals( new Franc(7)));
    }

}
