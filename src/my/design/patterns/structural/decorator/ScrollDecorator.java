package my.design.patterns.structural.decorator;

/**
 * Created by tayfuno on 06/12/15.
 */
public class ScrollDecorator extends Decorator {
    ScrollDecorator(VisualComponent c) {
        super.component = c;
    }

    // additional behavior
    //additional state
}
