package my.design.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        String data1 = "data";
        String data2 = "data2";
        s1.setData(data1);
        assertEquals(data1, s1.getData());
        assertEquals(data1, s2.getData());

        s2.setData(data2);
        assertEquals(data2, s1.getData());
        assertEquals(data2, s2.getData());
    }

}