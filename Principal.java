package Principal;

import Clases.Window;

import javax.swing.*;

public class Principal {
    public static void main (String [] args){
        Window window = new Window();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
