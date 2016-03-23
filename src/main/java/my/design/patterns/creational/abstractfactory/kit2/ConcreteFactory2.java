package my.design.patterns.creational.abstractfactory.kit2;

import my.design.patterns.creational.abstractfactory.AbstractFactory;
import my.design.patterns.creational.abstractfactory.ProductA;
import my.design.patterns.creational.abstractfactory.ProductB;

/**
 * Created by tayfuno on 21/11/15.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
