/**
 * Created by YDNPC on 14/11/2015.
 */
public class Dollar extends Money{

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}