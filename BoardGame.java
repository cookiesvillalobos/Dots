package Clases;

import Clases.Lists.LinkList;
import Clases.Lists.Matrix;
import Clases.Lists.Node;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class BoardGame extends JPanel implements MouseListener {
    Matrix matrix = new Matrix();
    private Vector<Line> vectorEnlace;
    private Vector<Dot> DotList = matrix.viewList();
    private Point p1, p2;
    private JLabel b1;
    Dot a = new Dot(0,0,0,0);
    Dot b;
    Lot lot = new Lot();

    public BoardGame(){
        setBackground(Color.BLACK); //Fondo de la pantalla
        this.vectorEnlace = new Vector<>();
        this.addMouseListener(this);

    }

    /**
     * Método para dibujar los componentes
     * @param g lo que se va a dibujar
     */
    public void paintComponent (Graphics g){

        g.setColor(Color.BLACK);
        g.fillRect(1,1,692,592);

        Graphics2D g2  = (Graphics2D) g;
        g2.setColor(Color.YELLOW);
        matrix.board1(g2);

        for (Line enlace: vectorEnlace){
            enlace.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1) {

            for (Dot dot : DotList) {

                if (new Rectangle(dot.getX(), dot.getY(), 10, 10).contains(e.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(dot.getX(), dot.getY());
                        a = dot;
                        System.out.println("Pos1 x: " + dot.getmX() + " Pos1 y: " + dot.getmY());
                    } else {
                        p2 = new Point(dot.getX(), dot.getY());
                        b = dot;
                        System.out.println("Pos2 x: " + dot.getmX() + " Pos2 y: " + dot.getmY());
                        if (lot.ju(a.getmX(), a.getmY(), b.getmX(), b.getmY())) {
                            System.out.println("Entró");
                            this.vectorEnlace.add(new Line(p1.x, p1.y, p2.x, p2.y));
                        }
                        repaint();
                        p1 = null;
                        p2 = null;
                    }
                }
            }

        }
    }




    @Override
    public void mousePressed(MouseEvent e) {

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

