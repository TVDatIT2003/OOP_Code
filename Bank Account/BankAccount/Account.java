/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount.accounttest;

/**
 *
 * @author acer
 */
public class Account {

    private double  balance;
    public Account (double initialBalance){
        if (initialBalance >= 0.0)
            balance = initialBalance;
    } 
    
    public void credit (double amount){
        balance += amount;
    }
    
    public double getBalance(){
        return balance;
    }
        
}

