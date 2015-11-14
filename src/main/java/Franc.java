/**
 * Created by YDNPC on 14/11/2015.
 */
public class Franc extends Money{
    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}