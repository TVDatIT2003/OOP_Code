/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author acer
 */
public class Interest {

    public static void main(String[] args) {
        double amount;
        double principle = 1000.0;
        double rate = 0.05;
        
        System.out.printf("%s%20s\n", "Year", "Amount of deposit");
        
        //Caculate
        for(int year = 1; year <= 10; year++){
            //Calculate new amount for specified year
            amount = principle * Math.pow(1.0 + rate, year);

            //Display the year and the amount
            System.out.printf("%4d%, 20.2f\n", year, amount);
        }
    }
}
