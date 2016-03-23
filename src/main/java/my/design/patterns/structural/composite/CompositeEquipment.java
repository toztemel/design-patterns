package my.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tayfuno on 23/11/15.
 */
public abstract class CompositeEquipment extends Equipment {

    List<Equipment> children;
    private Currency currency;

    public CompositeEquipment(String name) {
        super(name);
        children = new ArrayList<Equipment>();
    }

    @Override
    public void setNetPrice(Currency c) {
        this.currency = c;
    }

    @Override
    public Currency getNetPrice() {
        Iterator<Equipment> iterator = createIterator();
        Currency total = currency;
        while (iterator.hasNext()) {
            total = total.add(iterator.next().getNetPrice());
        }
        return total;
    }

    @Override
    public void add(Equipment e) {
        children.add(e);
    }

    @Override
    public void remove(Equipment e) {
        children.remove(e);
    }

    @Override
    public Iterator<Equipment> createIterator() {
        return children.iterator();
    }

}
