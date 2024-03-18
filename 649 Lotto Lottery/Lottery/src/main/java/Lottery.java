/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author acer
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main (String[] args){
        
        List <Integer> winningNumbers = new ArrayList<>();
        
        Random rd = new Random();

        //Creare randomly winning Numbers

        for (int i = 0; i<6; i++){
            while(true){
                int winningNumber = rd.nextInt(49) + 1;
            if (!winningNumbers.contains(winningNumber)){
                winningNumbers.add(winningNumber);
                break;
                }
            }
        }
        System.out.print(winningNumbers);
        
        //Input user number

        System.out.printf("\nPlease enter your 6 number between 1 and 49(inclusive).\n");

        Scanner input = new Scanner(System.in);
        
        List <Integer> guessedNumbers = new ArrayList<>(); 
        for (int i = 0; i<6; i++){
            System.out.println("Your current number are " + guessedNumbers);
            System.out.println("Please enter a number (1-49):");
            while(true){
                try{
                    String numberString = input.nextLine();
                    int number = Integer.parseInt(numberString);
                    if (number >=1 && number <= 49){
                        guessedNumbers.add(number);
                        break;
                    }
                    else{
                        System.out.println(number + " is an invalid number. Please try again.");
                    }
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Not a number. Please try again");
                }
            }
        }

        System.out.println("The winning number were: " + winningNumbers);
        System.out.println("Your number are: " + guessedNumbers);

       

        //Check the winnning lottery numbers

        int check = 0;
        for (int i = 0; i<6; i++ ){
            for(int j = 0; j< 6; j++){
                if (guessedNumbers.get(i) == winningNumbers.get(j)){
                    winningNumbers.remove(j);
                    check++;
                    break;
                }
            }
        }

        guessedNumbers.retainAll(winningNumbers);
        System.out.println("You match " +check+ " number ");

        //Check prize
        switch (check) {
            case 0 -> System.out.println("Sorry! You lose! Try again");
            case 1,2  -> System.out.println("Congatulation!!! You won $10");
            case 3 -> System.out.println("Congatulation!!! You won $100");
            case 4 -> System.out.println("Congatulation!!! You won $1000");
            case 5 -> System.out.println("Congatulation!!! You won $5000");
            default -> System.out.println("Congatulation!!! You won $5 million in cash!!! How do you do that?");
        }

    }  
}
