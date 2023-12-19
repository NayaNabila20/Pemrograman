package Tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class DataMahasiswa extends JFrame {
    private JPanel panelMain;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textAreaNama;
    private JTextArea textAreaTL;
    private JTextArea textAreaAlamat;
    private JTextArea Usia;
    private JButton PROSESButton;

    public DataMahasiswa() {
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        PROSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                int Tanggal = Integer.parseInt((String) comboBox1.getSelectedItem());
                int Bulan = comboBox2.getSelectedIndex() + 1;
                int Tahun = Integer.parseInt ((String) comboBox3.getSelectedItem());
                String alamat = textField2.getText();

                textAreaNama.setText("Nama :" + " " + nama);
                textAreaTL.setText("Tanggal Lahir :" + " " + Tanggal + " " + comboBox2.getSelectedItem() + " " + Tahun);
                textAreaAlamat.setText("Alamat :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(Tanggal, Bulan, Tahun);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();


                Usia.setText("Usia :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }
    public static void main(String[] args) {
        DataMahasiswa datamahasiswa= new DataMahasiswa();
        datamahasiswa.setVisible(true);
    }
}
