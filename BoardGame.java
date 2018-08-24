package clases;

import javax.swing.*;
import java.awt.*;

/**
 * En esta clase está como todo lo que ahora si se va a mostrar
 */

public class BoardGame extends JPanel {

    public int i = 0;
    public int j = 0;

    public BoardGame(){
        setBackground(Color.BLACK); // Fondo de la pantalla
    }

// Esta es la matriz de puntos
    int[][]  matriz = {{1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1},};
// Aquí es para dibujar los componentes
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);//color
        board1(g2);

    }
//Se recorre la matriz para dibujarla
    public void board1 (Graphics2D g){
        while (j<matriz.length){
            while (i< matriz[j].length){
                if (matriz[j][i] == 1){
                    Dot dot = new Dot((j+4)*70,(i+2)*20); //Posición del punto
                    g.fill(dot.getDot());
                }
                i = i + 1;
            }
            i = 0;
            j = j + 1;
        }
    }
}
