package my.design.patterns.structural.decorator;

/**
 * Created by tayfuno on 06/12/15.
 */
public class Client {

    public static void main(String[] args) {
        VisualComponent component = nestedComponents();

    }

    private static ScrollDecorator nestedComponents() {
        return new ScrollDecorator(new BorderDecorator(new Component(), 1));
    }
}
