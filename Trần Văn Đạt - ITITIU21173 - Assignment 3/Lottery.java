import java.util.Scanner;
import java.lang.Math;

public class Lottery {

    int userNumber[] = new int[6];
    int lotteryNumber[] = new int[6];

    public Lottery(){
        for(int i = 0; i < 6; i++){
            lotteryNumber[i] = (int)(Math.random() * 49 +1);
        }
    }

    public int[] userNumber1() {
        for(int i = 0; i < 6; i++){
            userNumber[i] = (int)(Math.random() * 49 +1);
        }
        return userNumber;
    }

    public int[] userNumber2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 numbers of your ticket (1 - 49): ");
        for(int i = 0; i < 6; i++){
            userNumber[i] = input.nextInt();
        }
        input.close();
        return userNumber;
    }

    public int Match(int [] userNumber, int [] lotteryNumber) {
        int count = 0;
        for(int i =0; i< 6; i++){
            if(userNumber[i] == lotteryNumber[i]){
                count ++;
            }
        }
        return count;
    }

    public int Prize(int Match){
        int prize = 0;
        switch(Match){
            case 1:
            case 2:
                prize = 10;
                break;
            case 3:
                prize = 100;
                break; 
            case 4:
                prize = 1000;
                break;
            case 5:
                prize = 5000;
                break;
            case 6:
                prize = 5000000;
                break;    
            default:
            break;
        }
        return prize;
    }
}
