/**
 * Created by YDNPC on 14/11/2015.
 */
interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
