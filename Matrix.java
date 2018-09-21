package Clases.Lists;

import Clases.Dot;
import Clases.Line;

import java.awt.*;
import java.util.Vector;

/**
 * Esta es la clase que crea la matriz para modelar el tablero
 */
public class Matrix {
    private Vector<Line> vectorEnlace;
    LinkList<LinkList> FinalList = new LinkList<>();
    LinkList<Integer> test = new LinkList<>();
    LinkList<Dot> DotsList = new LinkList<>();
    Vector<Dot> vectorDot = new Vector<>();
    LinkList<Line> LineUDList = new LinkList<>();
    LinkList<Line> LineLRList = new LinkList<>();
    int points = 0;
    private int p1X, p1Y, p2X, p2Y;
    private int p1mX, p1mY, p2mX, p2mY;

    /**
     * Constructor por defecto
     */
    public Matrix() {
    }

    /**
     * Método que crea la matriz
     */
    public void Create(){
        for (int i = 0; i<10; i++){
            LinkList<Integer> Column = new LinkList<>();
            for (int j = 0; j <10;j++){
                if ( (j%2)==0){
                    Column.addPrev(1);
                }
                else {
                    Column.addPrev(0);
                }
            }
            FinalList.addPrev(Column);
        }
        test.addPrev(1);
        test.addPrev(0);
    }
    /**
     * Método que devuelve la malla de puntos
     */
    public void board1(Graphics g) {
        Create();
        for (int i = 0; i<9; i++){
            for (int j = 0; j<9; j++){
                if (test.see(1)== FinalList.see(i).see(j)){
                    Dot dot = new Dot((i+1)*70, (j+10)*20, i, j);
                    vectorDot.add(dot);
                    DotsList.addPrev(dot);
                    dot.paint(g);
                }
            }
        }
    }

    /**
     * Método que devuelve la malla de líneas
     * @param g Objeto a dibujar
     */

    public void board2(Graphics g) {
        int i = 0;

        // primero se hacen todas las líneas verticales y se guardan en una lista
        while (i < 36) {
            if (i == 35) {
                i++;
            } else if ((i + 1) % 4 == 0) {
                i++;
            } else {
                p1X = DotsList.see(i).getX();
                p1Y = DotsList.see(i).getY();
                p2X = DotsList.see(i + 1).getX();
                p2Y = DotsList.see(i + 1).getY();
                p1mX = DotsList.see(i).getmX();
                p1mY = DotsList.see(i).getmY();
                p2mX = DotsList.see(i + 1).getmX();
                p2mY = DotsList.see(i + 1).getmY();

                Line line = new Line(p1X, p1Y, p2X, p2Y, false, p1mX, p1mY, p2mX, p2mY);
                LineUDList.addPrev(line);
                line.pintar(g);
                i++;
            }
        }
        // Luego se hacen todas las líneas horizontales y se guardan en otra lista
        i = 0;
        while (i < 32) {
            p1X = DotsList.see(i).getX();
            p1Y = DotsList.see(i).getY();
            p2X = DotsList.see(i + 4).getX();
            p2Y = DotsList.see(i + 4).getY();
            p1mX = DotsList.see(i).getmX();
            p1mY = DotsList.see(i).getmY();
            p2mX = DotsList.see(i + 4).getmX();

            p2mY = DotsList.see(i + 4).getmY();

            Line line = new Line(p1X, p1Y, p2X, p2Y, false, p1mX, p1mY, p2mX, p2mY);
            LineLRList.addPrev(line);
            line.pintar(g);
            i++;
        }
    }

    public Vector<Dot> viewList(){

     return vectorDot;
    }

    public void lines(int p1X, int p1Y, int p2X, int p2Y){
        int i = 0;
        while (i<32){
            if (i<26){
                Line line = LineUDList.see(i);
                int pm1X = LineUDList.see(i).getXm1();
                int pm1Y = LineUDList.see(i).getYm1();
                int pm2X = LineUDList.see(i).getXm2();
                int pm2Y = LineUDList.see(i).getYm2();

                if ((p1X == pm1X && p1Y == pm1Y && p2X == pm2X && p2Y == pm2Y) || (p2X == pm1X && p2Y == pm1Y && p1X == pm2X && p1Y == pm2Y)){
                    line.setDone(true);
                    System.out.println("La linea arriba: " + i + " está true");
                }


            }
            Line line = LineLRList.see(i);
            int pm1X = LineLRList.see(i).getXm1();
            int pm1Y = LineLRList.see(i).getYm1();
            int pm2X = LineLRList.see(i).getXm2();
            int pm2Y = LineLRList.see(i).getYm2();

            if ((p1X == pm1X && p1Y == pm1Y && p2X == pm2X && p2Y == pm2Y) || (p2X == pm1X && p2Y == pm1Y && p1X == pm2X && p1Y == pm2Y)) {
                line.setDone(true);
                System.out.println("La linea derecha: " + i + " está true");
            }

            i++;
        }

    }
    public void checkForPoints(){
        int c = 0;

        boolean one;
        boolean two;
        boolean three;
        boolean four;
        while (c<24){
            if (c>=0 && c<=7){
                one = LineUDList.see(c*4).isDone();
                two = LineUDList.see(c*4+1).isDone();
                three = LineLRList.see(c*3).isDone();
                four = LineLRList.see(c*3+3).isDone();
                if (one && two && three && four){
                    points = points +1;
                }
            }
            c++;

        }
    }

    public int getPoints(){
        return this.points;
    }


}
