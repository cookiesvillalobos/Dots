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
    private Point p1, p2;

    /**
     * Constructor por defecto
     */
    public Matrix() {
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
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
     * Método que devuelve lo que se va a poner en la pantalla
     */
    public void board1(Graphics g) {
        Create();
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if (test.see(1)== FinalList.see(i).see(j)){
                    Dot dot = new Dot((i+1)*70, (j+10)*20, i, j);
                    vectorDot.add(dot);
                    DotsList.addPrev(dot);
                    dot.paint(g);
                }
            }
        }
    }


    public Vector<Dot> viewList(){

       return vectorDot;
    }
}
