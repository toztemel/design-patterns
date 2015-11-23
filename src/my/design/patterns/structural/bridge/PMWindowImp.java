package my.design.patterns.structural.bridge;

import static java.lang.Math.*;

/**
 * Created by tayfuno on 21/11/15.
 */
public class PMWindowImp extends WindowImp {

    PMWindowImp() {

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
        int left = min(from, to);
        int right = max(from, to);

        pmDrawRectangle(left, right);
    }

    private void pmDrawRectangle(int left, int right) {
        // platfrom specific impl
    }

    @Override
    void drawText(int point, String text) {

    }

    @Override
    void drawBitmap() {

    }
}
