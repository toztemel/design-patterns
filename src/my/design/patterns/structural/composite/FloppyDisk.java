package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class FloppyDisk extends Equipment {

    private Currency currency;

    public FloppyDisk(String name) {
        super(name);
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
