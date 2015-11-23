package my.design.patterns.creational.factorymethod;

/**
 * Created by tayfuno on 21/11/15.
 */
public class ConcreteCreator extends Creater {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
