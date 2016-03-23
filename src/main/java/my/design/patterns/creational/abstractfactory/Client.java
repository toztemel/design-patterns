package my.design.patterns.creational.abstractfactory;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Client {

    private final ProductB productB;
    private final ProductA productA;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public ProductA getProductA() {
        return productA;
    }

    public ProductB getProductB() {
        return productB;
    }
}
