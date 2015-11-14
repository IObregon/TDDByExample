/**
 * Created by YDNPC on 14/11/2015.
 */
public class Dollar extends Money{
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}