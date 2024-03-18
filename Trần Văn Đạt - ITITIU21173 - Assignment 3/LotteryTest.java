import java.util.Scanner;
public class LotteryTest {
    public static void main(String[] args) throws Exception  { 
            Lottery l1 = new Lottery();
            Scanner input = new Scanner(System.in);

            System.out.println("How many game you want to play?");
            int game = input.nextInt();

            if(game == 1){
                System.out.println("Do you want to pick your own ticket numbers (True/False)?");
                String tf = input.next();
                if("True".equals(tf) || "true".equals(tf)){
                    l1.userNumber2();
            } else l1.userNumber1();

                System.out.println("You have picked up the ticket: ");
                for(int i = 0; i <6; i++){
                    System.out.printf(l1.userNumber[i] + " ");
            }

                System.out.println("The winning ticket is: ");
                for(int i = 0; i <6; i++){
                    System.out.printf(l1.lotteryNumber[i] + " ");
            }

            int lotteryMatch = l1.Match(l1.userNumber, l1.lotteryNumber);
            System.out.println("Your ticket has matched " + lotteryMatch + " number(s)");

            int lotteryWon = l1.Prize(lotteryMatch);
            if (lotteryWon > 0){
                System.out.println("You have won " + lotteryWon);
            }
            else System.out.println("Sorry you lose. Try again");
        }
        else{
            int totalTicket = game *4;
            int totalMoney = 0, countPrize = 0, countAll = 0;
            for (int i = 0; i< game; i++){
                l1.userNumber1();
                int lotteryMatch = l1.Match(l1.userNumber, l1.lotteryNumber);
                int lotteryWon = l1.Prize(lotteryMatch);
                if(lotteryWon > 0){
                    countPrize ++;
                }
                else if (lotteryWon == 6){
                    countAll++;
                }
                totalMoney += lotteryWon;
            }
            System.out.println("The number of games won any money: " + countPrize);
            System.out.println("The number of games matched all 6 numbers: " + countAll);
            System.out.println("The total money won: " + totalMoney);
            System.out.println("Total ticket cost: " + totalTicket);
            int profit = totalMoney - totalTicket;
            System.out.println("Profit/Loss (Won - Cost): " +profit);
        }
    }
}
