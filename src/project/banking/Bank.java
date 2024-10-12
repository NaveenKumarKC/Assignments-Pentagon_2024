package project.banking;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        accounts.put(accountNumber, new Account(accountNumber, accountHolderName, initialBalance));
        System.out.println("Account created for " + accountHolderName);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void grantLoan(String accountNumber, double amount, double interestRate) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.setLoanAmount(amount);
            account.setLoanInterestRate(interestRate);
            account.setBalance(account.getBalance() + amount);
            System.out.println("Loan granted of Rs " + amount + " to account " + accountNumber + " with interest rate " + interestRate + "%");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void calculateLoanInterest(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            double interest = account.getLoanAmount() * (account.getLoanInterestRate() / 100);
            System.out.println("Interest on loan for account " + accountNumber + " is Rs " + interest);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void repayLoan(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            double currentLoanAmount = account.getLoanAmount();
            if (amount >= currentLoanAmount) {
                account.setLoanAmount(0);
                account.setBalance(account.getBalance() - currentLoanAmount);
                System.out.println("Loan repaid fully. Remaining balance is Rs " + account.getBalance());
            } else {
                account.setLoanAmount(currentLoanAmount - amount);
                account.setBalance(account.getBalance() - amount );
                System.out.println("Partial loan repayment. Remaining loan amount is Rs " + account.getLoanAmount());
                System.out.println("Remaining Balance is " + account.getBalance());
            }
        } else {
            System.out.println("Account not found.");
        }
    }
   
}
