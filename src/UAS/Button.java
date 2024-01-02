package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {
    private JButton displayButton;
    private JTextArea resultTextArea;
    private JPanel panelMain;

    public Button() {

        this.setContentPane(panelMain);
        this.pack();

        setTitle("Odd Numbers Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        add(scrollPane);

        displayButton = new JButton("Display Odd Numbers");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayOddNumbers();
            }
        });
        add(displayButton);
    }

    private void displayOddNumbers() {
        StringBuilder result = new StringBuilder();
        int total = 0;

        for (int i = 1; i <= 100; i += 2) {
            result.append(i).append("\n");
            total += i;
        }

        resultTextArea.setText(result.toString());
        JOptionPane.showMessageDialog(this, "Total of Odd Numbers: " + total);
    }


}

