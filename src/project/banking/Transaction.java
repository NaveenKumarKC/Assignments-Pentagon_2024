package project.banking;

public class Transaction {

    public static void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited Rs " + amount + " into account " + account.getAccountNumber());
    }

    public static void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew Rs " + amount + " from account " + account.getAccountNumber());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void transfer(Account sender, Account receiver, double amount) {
        if (sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("Transferred Rs " + amount + " from account " + sender.getAccountNumber() + " to account " + receiver.getAccountNumber());
        } else {
            System.out.println("Insufficient funds in account " + sender.getAccountNumber());
        }
    }
    
    public static void display(Account sender, Account receiver,double amount)
    {
    	int tnx=1;
    	String str= String.format("%05d", tnx);
    	tnx++;
    	System.out.println("Transaction ID \t  From \t\t  To \t\t Amount \t");
    	System.out.println(str +"\t\t"+ sender.getAccountNumber()+"\t"+ receiver.getAccountNumber() +"\t"+ amount );
    }
}
