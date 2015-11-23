package my.design.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonsTest {

    @Test
    public void testRegister() throws Exception {
        Singletons.register("First", new FirstSingleton());
        assertTrue(Singletons.getInstance("First") instanceof FirstSingleton);
        Singletons.register("Second", new SecondSingleton());
        assertTrue(Singletons.getInstance("First") instanceof FirstSingleton);
    }

    @Test
    public void testLookup() throws Exception {
        Singletons.register("First", new FirstSingleton());
        Singletons.register("Second", new SecondSingleton());
        assertTrue(Singletons.lookup("First") instanceof FirstSingleton);
        assertTrue(Singletons.lookup("Second") instanceof SecondSingleton);

    }

    private class FirstSingleton extends Singleton {
    }

    private class SecondSingleton extends Singleton {
    }
}