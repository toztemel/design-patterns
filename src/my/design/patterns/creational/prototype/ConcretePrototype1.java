package my.design.patterns.creational.prototype;

/**
 * Created by tayfuno on 21/11/15.
 */
public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype cloneInstance() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
