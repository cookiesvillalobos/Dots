package clases;
import javax.swing.*;

/**
 * En esta clase está la ventana del usuario, son como los valores para determinarla
 */

public class Window extends JFrame {
    private final int WIDTH=1200, HEIGH=1000; // Dimensiones de la ventana
    private BoardGame sheet;

    public Window(){
        setTitle("Dots"); //Título de la ventana
        setSize(WIDTH,HEIGH); //Dimensiones
        setLocationRelativeTo(null); //Posición en la pantalla
        setResizable(false); //No se puede hacer más grande
        sheet = new BoardGame(); //Lámina donde se ponen los objetos
        add(sheet); //Se coloca la lámina en la ventana

    }
}
