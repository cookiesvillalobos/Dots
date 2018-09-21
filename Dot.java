package Clases;

import java.awt.*;

public class Dot {
    private int x; //posición X en la pantalla
    private int y; //posición Y en la pantalla
    private int mX; //posición X en la matriz
    private int mY; // posición Y en la matriz

    public Dot(int x, int y, int mX, int mY) {
        this.x = x;
        this.y = y;
        this.mX = mX;
        this.mY = mY;
    }

    public void paint (Graphics g){
        g.drawOval(x,y,10,10);
        g.fillOval(x,y,10,10);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getmX() {
        return mX;
    }

    public void setmX(int mX) {
        this.mX = mX;
    }

    public int getmY() {
        return mY;
    }

    public void setmY(int mY) {
        this.mY = mY;
    }
}
