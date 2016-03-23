package my.design.patterns.structural.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScrollDecoratorTest {

    VisualComponent aComponent;

    @Before
    public void setup() {
        aComponent = new MockComponent();
    }

    @Test
    public void testDecorator() {
        VisualComponent c = new Decorator(aComponent);
        assertFalse(((MockComponent)aComponent).executedResize);
        assertFalse(((MockComponent) aComponent).executedDraw);

        c.draw();
        assertTrue(((MockComponent) aComponent).executedDraw);

        c.resize();
        assertTrue(((MockComponent) aComponent).executedResize);
    }

    private class MockComponent implements VisualComponent {
        boolean executedResize;
        boolean executedDraw;

        @Override
        public void draw() {
            executedDraw = true;
        }

        @Override
        public void resize() {
            executedResize = true;
        }
    }

    @Test
    public void testNestedDecorator() {
        VisualComponent decorator1 = new ScrollDecorator(aComponent);
        VisualComponent decorator2 = new BorderDecorator(decorator1, 9);

        decorator2.draw();

        assertTrue(((ScrollDecorator)decorator1).isDrawn());
        assertTrue(((MockComponent)aComponent).executedDraw);

        decorator2.resize();

        assertTrue(((ScrollDecorator)decorator1).isResized());
        assertTrue(((MockComponent)aComponent).executedResize);
    }
}