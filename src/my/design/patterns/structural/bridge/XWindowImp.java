package my.design.patterns.structural.bridge;

import static java.lang.Math.*;

/**
 * Created by tayfuno on 21/11/15.
 */
public class XWindowImp extends WindowImp {

    XWindowImp() {

    }

    @Override
    void top() {

    }

    @Override
    void bottom() {

    }

    @Override
    void setExtent(int extent) {

    }

    @Override
    void setOrigin(int origin) {

    }

    @Override
    void drawRectangle(int from, int to) {
        int x = round(min(from, to));
        int y = round(max(from, to));
        xDrawRectangle(x,y);
    }

    private void xDrawRectangle(int x, int y) {
        //platform specific impl
    }

    @Override
    void drawText(int point, String text) {

    }

    @Override
    void drawBitmap() {

    }
}
