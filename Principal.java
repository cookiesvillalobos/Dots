package principal;

/**
 * Esta es la clase que se corre.
 * Se define la ventana y que esta se pueda cerrar y alguna otra cosa que sea muy principal
 */
import clases.Window;

import javax.swing.*;

public class Principal {

    public static void main (String args[]){
        Window window = new Window();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
