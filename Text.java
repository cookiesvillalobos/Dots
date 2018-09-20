package Clases;

import javax.swing.*;
import java.awt.*;

public class Text {
    JLabel player1 = new JLabel();
    JLabel player2 = new JLabel();
    public JLabel viewText() {

        player1.setText("JUGADOR 1");
        player2.setText("JUGADOR 2");
        player1.setBounds(250,250,0,0);
        //player1.setLocation(0,20);
        //player1.setFont(new Font("Arial",0,18));
        return player1;
    }
}
