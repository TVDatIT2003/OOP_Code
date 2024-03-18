import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main (String[] args){
        
        List <Integer> winningNumbers = new ArrayList<>();
        
        Random rd = new Random();
        
        for (int i = 0; i<6; i++){
                int winningNumber = rd.nextInt(49) + 1;
                System.out.print(winningNumber);
                System.out.printf("\t");
        }
        
    }  
}
