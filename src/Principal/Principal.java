package Principal;

import Clases.Window;

import javax.swing.*;

/**
 * Clase principal
 * Crea la pantalla y tiene una instancia de la ventana
 * Hace que se pueda cerrar la ventana con el botón de la X
 * Es la clase que se corre
 */
public class Principal {
    public static void main (String [] args){
        Window window = new Window();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
