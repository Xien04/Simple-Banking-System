package classesandobjects;

import java.util.List;

public class Teller {
    String tellerName;
    double yearsOfExp;
    boolean regularStatus;
    
    public Teller(String tellerName, double yearsOfExp, boolean regularStatus){
        this.tellerName = tellerName;
        this.yearsOfExp = yearsOfExp;
        this.regularStatus = regularStatus;
    }
    
    public void greetCustomer(Customer customer){
        String title;
        if(customer.getGender().equals("Male") || customer.getGender().equals("M")){
            title = "Mr.";
        }
        else{
            title = "Ms.";
        }
        System.out.println("Welcome to BDO " + title + " " + customer.getName()
        + ". I am your teller for today " + tellerName);
        System.out.println("What can I do for you?");
    }
    
    public void sayTotalCustomerBalance(Customer customer){
        List<Account> customerAccounts = customer.getAccounts();
        if(customerAccounts.size() == 0){
            System.out.println("Sorry, you do not have any account with us");
        }
        else{
            double totalBalance = 0;
            for(int i = 0; i < customerAccounts.size(); i++){
                totalBalance += customerAccounts.get(i).getBalance();
            }
            
            System.out.println("Your total balance is " + totalBalance);
        }
    }
        
    public boolean depositToAccount(Customer customer, String accountNumber,
                double amount){
        List<Account> customerAccounts = customer.getAccounts();
        for(Account account: customerAccounts){
            if(account.getAccountNumber().equals(accountNumber)){
                account.addBalance(amount);
                System.out.println("Successful, your new balance is " + 
                        account.getBalance());
                return true;
            }
        }
        System.out.println("Account does not exist");
        return false;
    }
    
    public boolean transfer(Customer customer, String sourceNum,
            String destNum, double amount){
        Account source = null;
        Account dest = null;
        List<Account> customerAccounts = customer.getAccounts();
        for(Account account: customerAccounts){
            if(sourceNum.equals(account.getAccountNumber()))
                source = account;
            else if(destNum.equals(account.getAccountNumber()))
                dest = account;
        }
        
        if(source != null && dest != null){
            boolean deducted = source.deductBalance(amount);
            if(deducted){
                dest.addBalance(amount);
                System.out.println("Transfer succesful");
                System.out.println("New balances are: ");
                for(Account account: customerAccounts){
                    System.out.println(account.getAccountNumber() + " " +
                            account.getBalance());
                }
                return true;
            }
        }
        return false;
    }

 }

