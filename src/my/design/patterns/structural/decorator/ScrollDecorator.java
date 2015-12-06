package my.design.patterns.structural.decorator;

/**
 * Created by tayfuno on 06/12/15.
 */
public class ScrollDecorator extends Decorator {
    private boolean isDrawn;
    private boolean isResized;

    ScrollDecorator(VisualComponent c) {
        super(c);
    }

    public void draw() {
        super.draw();
        isDrawn = true;
    }

    public void resize() {
        super.resize();
        isResized = true;
    }

    public boolean isDrawn() {
        return isDrawn;
    }

    public boolean isResized() {
        return isResized;
    }

    // additional behavior
    //additional state
}
