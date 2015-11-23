package my.design.patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Singletons {

    static Map registry = new HashMap();
    private static Singleton instance;

    static void register (String name, Singleton singleton) {
        registry.put(name, singleton);
    }

    static Singleton getInstance(String name) {
        if (instance == null) {
            instance = lookup(name);
        }
        return instance;
    }

    static Singleton lookup(String name) {
        return (Singleton) registry.get(name);
    }
}
