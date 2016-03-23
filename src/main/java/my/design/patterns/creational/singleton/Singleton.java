package my.design.patterns.creational.singleton;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Singleton {

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    public Singleton() {
    }

    String data;

    void setData(String d) {
        data = d;
    }

    String getData() {
        return data;
    }
}
