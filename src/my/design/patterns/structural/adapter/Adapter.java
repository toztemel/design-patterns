package my.design.patterns.structural.adapter;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Adapter implements Adaptee, Target {

    @Override
    public void request() {
        specificRequest();
    }

    @Override
    public void specificRequest() {
        System.out.println("adaptee is executed");
    }

}
