package my.design.patterns.structural.adapter;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Client {

    public static void main(String[] args) {
        Target t = new Adapter();
        t.request();

        t = new Adapter2(new Adaptee() {
            @Override
            public void specificRequest() {
                System.out.println("Adaptee is executed");
            }
        });
        t.request();
    }
}
