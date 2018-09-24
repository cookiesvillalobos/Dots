package Clases;

import java.awt.*;

public class Figure {
    int xpoints[];
    int ypoints[];
    int npoints = 4;
    boolean done;
    int player = 0;


    public Figure(int[] xpoints, int[] ypoints, boolean done) {
        this.xpoints = xpoints;
        this.ypoints = ypoints;
        this.done = done;
    }

    public void paint(Graphics g) {
        if (!done){
            g.setColor(Color.RED);
            g.fillPolygon(xpoints, ypoints, npoints);

        }
        else {
            if (player == 1) {
                g.setColor(Color.GREEN);
                g.fillPolygon(xpoints, ypoints, npoints);
            }
            else if (player == 2){
                g.setColor(Color.WHITE);
                g.fillPolygon(xpoints, ypoints, npoints);
            }
        }
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }
}
