package ListingChapter7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bio extends JFrame {
    public JTextField nameField, addressField;
    public JComboBox<String> dayComboBox, monthComboBox, yearComboBox;
    public JTextArea outputArea;

    public Bio() {
        // Set frame properties
        setTitle("Biodata App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        nameField = new JTextField(20);
        addressField = new JTextField(20);

        String[] days = new String[31];
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] years = new String[100];

        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(currentYear - i);
        }

        dayComboBox = new JComboBox<>(days);
        monthComboBox = new JComboBox<>(months);
        yearComboBox = new JComboBox<>(years);

        JButton processButton = new JButton("Process");
        processButton.addActionListener(new ProcessButtonListener());

        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        // Create layout and add components
        setLayout(new GridLayout(6, 2));
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Date of Birth:"));
        add(dayComboBox);
        add(monthComboBox);
        add(yearComboBox);
        add(new JLabel("Address:"));
        add(addressField);
        add(new JLabel(" "));
        add(processButton);
        add(new JLabel("Output:"));
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public class ProcessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                processBiodata();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void processBiodata() throws ParseException {
        // Get input values
        String name = nameField.getText();
        String day = (String) dayComboBox.getSelectedItem();
        String month = (String) monthComboBox.getSelectedItem();
        String year = (String) yearComboBox.getSelectedItem();
        String address = addressField.getText();

        // Concatenate date of birth
        String dobString = day + " " + month + " " + year;

        // Parse date of birth
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        Date dob = sdf.parse(dobString);

        // Calculate age
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);
        Calendar currentCalendar = Calendar.getInstance();
        int age = currentCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);

        // Display output
        String output = "Name: " + name + "\nDate of Birth: " + dobString + "\nAddress: " + address + "\nAge: " + age;
        outputArea.setText(output);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BiodataApp());
    }
}

