package Clases;

import java.awt.*;

public class Line {
    private int x1, y1, x2, y2;
    private boolean done;
    private int xm1, ym1, xm2, ym2;


    public Line(int x1, int y1, int x2, int y2, boolean done, int xm1, int ym1, int xm2, int ym2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.done = done;
        this.xm1 = xm1;
        this.ym1 = ym1;
        this.xm2 = xm2;
        this.ym2 = ym2;
    }

    public void pintar (Graphics g){
        if (done) {
            g.setColor(Color.RED);
            g.drawLine(x1,y1,x2,y2);
        }
        else {
            g.setColor(Color.YELLOW);
            g.drawLine(x1,y1,x2,y2);
        }
    }

    public int getXm1() {
        return xm1;
    }

    public int getYm1() {
        return ym1;
    }

    public int getXm2() {
        return xm2;
    }

    public int getYm2() {
        return ym2;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }
}
