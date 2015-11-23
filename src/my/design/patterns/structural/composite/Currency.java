package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class Currency {

    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public Currency add(Currency netPrice) {
        return new Currency(this.amount + netPrice.getAmount());
    }

    public int getAmount() {
        return amount;
    }
}
