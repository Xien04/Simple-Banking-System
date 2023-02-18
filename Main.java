

public class Main {

    public static void main(String[] args) {
       
        Teller teller1 = new Teller("Jane", 2.5, true);
        Customer customer1 = new Customer("Mark", "Male");
        
        teller1.greetCustomer(customer1);
        
        //open account
        Account account = new Account("1245436543", "Mark", 1000);
        customer1.addAccount(account);
        
        Account account2 = new Account("78683543", "Mark", 100);
        customer1.addAccount(account2);
        
        teller1.sayTotalCustomerBalance(customer1);
        
        teller1.depositToAccount(customer1, "78683543", 15);
        
        teller1.transfer(customer1, "1245436543", "78683543",
                99);
        
        
    }
    
}
