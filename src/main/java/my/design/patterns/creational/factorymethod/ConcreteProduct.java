package my.design.patterns.creational.factorymethod;

/**
 * Created by tayfuno on 21/11/15.
 */
public class ConcreteProduct implements Product {

    public static final String name = "I am Concrete!";

    @Override
    public String getName() {
        return name;
    }
}
