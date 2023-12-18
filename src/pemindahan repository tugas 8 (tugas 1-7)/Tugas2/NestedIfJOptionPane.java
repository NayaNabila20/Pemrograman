package Tugas2;

import javax.swing.JOptionPane;
public class NestedIfJOptionPane{
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");
        if ( username != null && password != null
                &&(
                (username.equals("naya") && password.equals("123"))||
                        (username.equals("nabila") && password.equals("456"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "Halo nayaa.");
        } else {
            JOptionPane.showMessageDialog(null, "Kamu siapa.");
        }
    }
}