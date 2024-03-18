/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bankaccount.accounttest;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        
        System.out.printf("Account 1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("Account 2 balance: $%.2f\n",account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;
        
        System.out.print("Enter deposit amount for account 1");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account 1 balance\n\n", depositAmount);
        account1.credit(depositAmount);
        
        //display balance
        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
        
        System.out.print("Enter deposit amount for account 2");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account 2 balance\n\n", depositAmount);
        account2.credit(depositAmount);
        
        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
    }
}
