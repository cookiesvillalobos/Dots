package Clases;

import javax.swing.*;
import java.awt.*;

public class BoardGame extends JPanel {
    public BoardGame(){
        setBackground(Color.BLACK); //Fondo de la pantalla
    }

    /**
     * Método para dibujar los componentes
     * @param g lo que se va a dibujar
     */
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2  = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        board1(g2);

    }

    public void board1 (Graphics2D g){
        g.fillOval(25,25,50,50);
    }

}
