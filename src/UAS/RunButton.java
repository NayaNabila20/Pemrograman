package UAS;

import Tugas10.buttonUAS;

import javax.swing.*;

public class RunButton extends Button{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tugas10.buttonUAS form = new Tugas10.buttonUAS();
                form.setVisible(true);
            }
        });
    }
}
