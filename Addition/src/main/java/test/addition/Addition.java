/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.addition;

/**
 *
 * @author acer
 */
import javax.swing.JOptionPane;

public class Addition {

    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        //convert String --> Int
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        //Display result
        JOptionPane.showMessageDialog(null, "The sum is " +sum, "Sum of  Two Integer", JOptionPane.PLAIN_MESSAGE);
    }
}
