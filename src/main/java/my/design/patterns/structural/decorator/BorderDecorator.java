package my.design.patterns.structural.decorator;

/**
 * Created by tayfuno on 06/12/15.
 */
public class BorderDecorator extends Decorator {

    BorderDecorator(VisualComponent c, int width) {
        super(c);
    }

    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        // draw borber by width
    }
}
