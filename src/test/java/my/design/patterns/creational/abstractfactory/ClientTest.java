package my.design.patterns.creational.abstractfactory;

import my.design.patterns.creational.abstractfactory.kit1.ConcreteFactory1;
import my.design.patterns.creational.abstractfactory.kit1.ProductA1;
import my.design.patterns.creational.abstractfactory.kit1.ProductB1;
import my.design.patterns.creational.abstractfactory.kit2.ConcreteFactory2;
import my.design.patterns.creational.abstractfactory.kit2.ProductA2;
import my.design.patterns.creational.abstractfactory.kit2.ProductB2;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClientTest {

    @Test
    public void testConcreteFactory1() throws Exception {

        Client client = new Client(new ConcreteFactory1());
        assertTrue(client.getProductA() instanceof ProductA1);
        assertTrue(client.getProductB() instanceof ProductB1);
    }

    @Test
    public void testConcreteFactory2() throws Exception {

        Client client = new Client(new ConcreteFactory2());
        assertTrue(client.getProductA() instanceof ProductA2);
        assertTrue(client.getProductB() instanceof ProductB2);
    }

}