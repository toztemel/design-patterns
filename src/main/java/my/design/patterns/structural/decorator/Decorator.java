package my.design.patterns.structural.decorator;

/**
 * Created by tayfuno on 06/12/15.
 */
public class Decorator implements VisualComponent {

    VisualComponent component;

    public Decorator(VisualComponent c) {
        this.component = c;
    }

    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public void resize() {
        component.resize();
    }
}
