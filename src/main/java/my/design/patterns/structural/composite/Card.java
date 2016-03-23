package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class Card extends Equipment {

    private Currency currency;

    public Card(String s) {
        super(s);
    }

    @Override
    public Watt Power() {
        return null;
    }

    @Override
    public void setNetPrice(Currency c) {
        this.currency = c;
    }

    @Override
    public Currency getNetPrice() {
        return currency;
    }

    @Override
    public Currency getDiscountPrice() {
        return null;
    }

    @Override
    public void add(Equipment e) {

    }

    @Override
    public void remove(Equipment e) {

    }
}
