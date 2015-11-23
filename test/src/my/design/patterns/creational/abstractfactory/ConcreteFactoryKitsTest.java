package my.design.patterns.creational.abstractfactory;

import my.design.patterns.creational.abstractfactory.kit1.ConcreteFactory1;
import my.design.patterns.creational.abstractfactory.kit1.ProductA1;
import my.design.patterns.creational.abstractfactory.kit1.ProductB1;
import my.design.patterns.creational.abstractfactory.kit2.ConcreteFactory2;
import my.design.patterns.creational.abstractfactory.kit2.ProductA2;
import my.design.patterns.creational.abstractfactory.kit2.ProductB2;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by tayfuno on 21/11/15.
 */
public class ConcreteFactoryKitsTest {

    @Test
    public void testKit1() {
        AbstractFactory factory = new ConcreteFactory1();
        assertTrue(factory.createProductA() instanceof ProductA1);
        assertTrue(factory.createProductB() instanceof ProductB1);
    }

    @Test
    public void testKit2() {
        AbstractFactory factory = new ConcreteFactory2();
        assertTrue(factory.createProductA() instanceof ProductA2);
        assertTrue(factory.createProductB() instanceof ProductB2);
    }
}
