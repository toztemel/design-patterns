package my.design.patterns.creational.factorymethod;

/**
 * Created by tayfuno on 21/11/15.
 */
public abstract class Creater {

    Product p;

    abstract Product factoryMethod();

    Product makeProduct() {
        p = factoryMethod();
        return p;
    }
}
