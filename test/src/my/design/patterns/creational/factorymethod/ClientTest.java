package my.design.patterns.creational.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testRun() throws Exception {

        Client c = new Client(new ConcreteCreator());
        assertEquals (ConcreteProduct.name, c.run().getName());

    }
}