package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class Cabinet extends CompositeEquipment {

    public Cabinet(String name) {
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
