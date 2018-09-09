package Clases;

import javax.swing.*;

public class Window extends JFrame {
    private final int WIDTH = 1200, HEIGH = 1000; //Dimensiones de la pantalla
    private BoardGame sheet;

    public Window(){
        setTitle("Dots"); //Título de la ventana
        setSize(WIDTH,HEIGH); //Dimensiones
        setLocationRelativeTo(null); //Posición en el centro de la pantalla
        setResizable(false); // No se puede cambiar el tamaño
        sheet =new BoardGame();
        add(sheet);

    }
}

