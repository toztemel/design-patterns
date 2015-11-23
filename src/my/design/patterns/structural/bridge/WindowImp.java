package my.design.patterns.structural.bridge;

/**
 * Created by tayfuno on 21/11/15.
 *
 * Declares an interface to the underlying windowing system
 */
public abstract class WindowImp {

    protected WindowImp() {

    }

    abstract void top();

    abstract void bottom();

    abstract void setExtent(int extent);

    abstract void setOrigin(int origin);

    abstract void drawRectangle(int from, int to);

    abstract void drawText(int point, String text);

    abstract void drawBitmap();

}
