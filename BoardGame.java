package Clases;

import Clases.Lists.LinkList;
import Clases.Lists.Matrix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

/**
 * Es la clase que se encarga de hacer las cosas en la pantalla y dibujar.
 * Interactúa con las demás clases para hacer los componentes en la pantalla y tener un juego óptimo
 */
public class BoardGame extends JPanel implements MouseListener {

    private Matrix matrix = new Matrix();
    private Vector<Dot> DotList = matrix.viewList();
    private LinkList<Line> LineUDList = matrix.getLineUDList();
    private LinkList<Line> LineLRList = matrix.getLineLRList();
    private LinkList<Figure> FigureList = matrix.getFigureList();
    private Point p1, p2;
    private int p1mX, p1mY, p2mX, p2mY;
    private JLabel b1;
    private Dot a = new Dot(0,0,0,0);
    private Dot b;
    private Lot lot = new Lot();
    private int TotalPoint = 0;
    private int indicator = 0;
    private int actualPlayer = 1;
    private int Turn = 0;
    private int Player1Points = 0;
    private int Player2Points = 0;
    JLabel player1Label = new JLabel("Jugador 1: " + TotalPoint);

    /**
     * Es el constructor que determina el color del fondo y agrega el mouse
     */
    public BoardGame(){
        setBackground(Color.BLACK); //Fondo de la pantalla
        this.addMouseListener(this);

    }

    /**
     * Método para dibujar los componentes
     * @param g lo que se va a dibujar
     */
    public void paintComponent (Graphics g){
        if ( indicator ==0) {
            g.setColor(Color.BLACK);
            g.fillRect(1, 1, 692, 592);

            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.YELLOW);
            matrix.board1(g2);
            matrix.board2(g2);
            matrix.board3(g2);
            indicator++;
            System.out.println("Es el turno del jugador 1");
        }
        else {

            int i = 0;
            while (i < 32) {
                Line line;
                line = LineLRList.see(i);
                line.pintar(g);
                i++;
            }
            i = 0;
            while (i < 27) {
                Line line;
                line = LineUDList.see(i);
                line.pintar(g);
                i++;
            }

            i=0;
            while (i<24){
                Figure figure;
                figure = FigureList.see(i);
                figure.paint(g);
                i++;
            }
        }

        System.out.println("Puntos totales: " + TotalPoint);
        System.out.println("Puntos jugador 1: " + Player1Points);
        System.out.println("Puntos jugador 2: " + Player2Points);




    }

    /**
     * Método que escucha al mouse y sabe cuando se presionan los botones del mismo para dibujar una línea
     * @param e es el evento o botón presionado
     */
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {


            for (Dot dot : DotList) {

                if (new Rectangle(dot.getX(), dot.getY(), 10, 10).contains(e.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(dot.getX(), dot.getY());
                        p1mX = dot.getmX();
                        p1mY = dot.getmY();
                        a = dot;
                        break;
                    }
                    else if (p1.x != dot.getX() || p1.y != dot.getY()) {
                        p2 = new Point(dot.getX(), dot.getY());
                        p2mX = dot.getmX();
                        p2mY = dot.getmY();
                        b = dot;

                        if (lot.ju(a.getmX(), a.getmY(), b.getmX(), b.getmY())) {
                            matrix.lines(p1mX, p1mY, p2mX, p2mY, actualPlayer, Turn);
                            TotalPoint = matrix.checkForPoints(actualPlayer);
                            Player1Points = matrix.Player1Points();
                            Player2Points = matrix.Player2Points();
                            if (actualPlayer == 1){
                                System.out.println("Es es el turno del jugador 2");
                                actualPlayer = 2;
                                Turn++;
                            }
                            else {
                                System.out.println("Es el turno del jugador 1");
                                actualPlayer = 1;
                                Turn++;
                            }
                        }

                        repaint();
                        p1 = null;
                        p2 = null;
                        a = null;
                        b = null;
                        break;
                    }
                }
            }

        }
    }




    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

