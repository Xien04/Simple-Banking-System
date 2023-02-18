/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mvgo
 */
public class Customer {
    
    String name;
    String gender;
    List<Account> accounts;
    
    public Customer(String name, String gender){
        this.name = name;
        this.gender = gender;
        
        accounts = new ArrayList<Account>();
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void addAccount(Account account){
        accounts.add(account);
    }
    
    public List<Account> getAccounts(){
        return accounts;
    }
}
