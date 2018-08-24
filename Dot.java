package clases;
import java.awt.geom.Rectangle2D;

/**
 * Esta clase es la que hace el punto
 */
public class Dot {
    private int x;
    private int y;
    private final int WIDTH=10, HEIGH=10;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getDot(){
        return new Rectangle2D.Double(x,y,WIDTH,HEIGH);
    }

}
