package JavaGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame{

    Button(){

        JButton button;

        button = new JButton();
        button.setBounds(200,100,100,50);

        this.setTitle("this title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

}
