/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author acer
 */
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        //Enter name from user
        String name = JOptionPane.showInputDialog("What is your name ?");
        
        //Create message
        String message =
                String.format("Welcome, %s, to Java Programming", name);
        
        //Display message
        JOptionPane.showMessageDialog(null, message);
    }
}
