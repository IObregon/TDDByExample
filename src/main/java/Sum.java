/**
 * Created by YDNPC on 14/11/2015.
 */
class Sum implements Expression {
    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression addend){
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to){
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public Expression plus(Expression addend) {
        return null;
    }
}
