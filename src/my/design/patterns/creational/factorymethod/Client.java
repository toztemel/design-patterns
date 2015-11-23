package my.design.patterns.creational.factorymethod;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Client {

    private final Creater creater;

    Client(Creater creater) {
        this.creater = creater;
    }

    Product run() {
        Product product = creater.makeProduct();
        return product;
    }
}
