/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvgo
 */
public class Account {
    
    String accountNumber;
    String accountName;
    double balance;
    
    public Account(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public boolean deductBalance(double amount){
        if(balance - amount >= 0){
            balance = balance - amount;
            return true;
        }
        else
            return false;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public void addBalance(double amount){
        balance = balance + amount;
    }
}
