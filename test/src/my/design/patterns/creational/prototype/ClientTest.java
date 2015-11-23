package my.design.patterns.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public  void test() {
        Client c = new Client(new ConcretePrototype1());
        assertTrue(c.anOperation() instanceof  ConcretePrototype1);
        assertFalse(c.anOperation() instanceof ConcretePrototype2);

        c = new Client(new ConcretePrototype2());
        assertTrue(c.anOperation() instanceof ConcretePrototype2);
    }
}