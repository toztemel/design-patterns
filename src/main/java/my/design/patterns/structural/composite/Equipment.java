package my.design.patterns.structural.composite;

import java.util.Iterator;

/**
 * Created by tayfuno on 23/11/15.
 */
public abstract class Equipment {

    private String name;

    protected Equipment(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public abstract Watt Power();

    public abstract void setNetPrice(Currency c);

    public abstract Currency getNetPrice();

    public abstract Currency getDiscountPrice();

    public abstract void add(Equipment e);

    public abstract void remove(Equipment e);

    public Iterator<Equipment> createIterator() {
        return new NullIterator();
    }

    private class NullIterator implements Iterator<Equipment> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Equipment next() {
            return null;
        }
    }
}
