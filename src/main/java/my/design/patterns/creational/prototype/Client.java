package my.design.patterns.creational.prototype;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Client {

    Prototype type;
    public Client(Prototype prototype) {
        type = prototype;
    }

    Prototype anOperation() {
        Prototype newInstance = type.cloneInstance();
        return newInstance;
    }
}
