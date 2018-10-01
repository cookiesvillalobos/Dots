package Clases;


import javax.swing.*;

/**
 * Clase que tiene distintos métodos importantes para el desarrollo del programa
 */
public class Lot {
    boolean a = false;

    /**
     * Método que determina si una línea se puede o no dibujar entre los puntos seleccionados
     * @param x1 Posición X dentro de la malla del primer punto
     * @param y1 Posición Y dentro de la malla del primer punto
     * @param x2 Posición X dentro de la malla del último punto
     * @param y2 Posición Y dentro de la malla del último punto
     * @return
     */
    public boolean ju(int x1, int y1, int x2, int y2) {
        System.out.println("Punto 1: " + x1 + " " + y1 + "Punto 2: " + x2 + " " + y2);
        if (x1 == x2) {
            if (y2 == (y1 + 2) | y2 == (y1 - 2)) {
                a = true;
                //System.out.println(" A1" + a);
            } else {
                a = false;
                //System.out.println(" A2" + a);
            }
        }

        if (y1 == y2) {
            if (x2 == (x1 + 1) | x2 == (x1 - 1)) {
                a = true;
                //System.out.println(" B1" + a);
            } else {
                a = false;
                //System.out.println(" B2" + a);
            }
        }
        System.out.println(a);
        return a;
    }

    public JLabel text(int TotalPoint){
        JLabel player1Label = new JLabel("Jugador 1: " + TotalPoint);
        player1Label.setBounds(43, 50, 100, 100);
        return player1Label;
    }
}
