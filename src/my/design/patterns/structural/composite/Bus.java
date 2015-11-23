package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class Bus extends CompositeEquipment {

    public Bus(String name) {
        super(name);
    }

    @Override
    public Watt Power() {
        return null;
    }

    @Override
    public Currency getDiscountPrice() {
        return null;
    }
}
