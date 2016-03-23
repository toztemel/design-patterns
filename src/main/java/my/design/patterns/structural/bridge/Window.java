package my.design.patterns.structural.bridge;

/**
 * Created by tayfuno on 21/11/15.
 *
 * Defines window abstraction for clint application
 */
public abstract class Window {

    private String contents;
    private WindowImp imp;

    public Window(String contents) {
        this.contents = contents;
    }

    public abstract void open();

    public abstract void close();

    public void setOrigin(int at) {
        getWindowImp().setOrigin(at);
    }

    public void setExtent(int extent) {
        getWindowImp().setExtent(extent);
    }

    public abstract void raise();

    public abstract void lower();

    public abstract void drawLine(int from, int to);

    public void drawRect(int from, int to) {
        getWindowImp().drawRectangle(from, to);
    }

    public abstract void drawPolygon(int... points);

    public void drawText(int point, String text) {
        getWindowImp().drawText(point, text);
    }

    protected WindowImp getWindowImp() {
        if (imp == null)
            imp = WindowSystemFactory.getInstance().makeWindowImp();
        return imp;
    }

    protected String getContent() {
        return contents;
    }
}
