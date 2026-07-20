package L2.Examples.Bank;

/*
Source: .pdf (page 1 of 1)
Created by ali_h on 7/15/2026 at 18:45
*/

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 100000;
    }

    double getBalance(){
        return balance;
    }
    void setBalance(double amount){
        // WE CAN SET ANY REQUIRED CONDITIONS
        balance+=amount;
    }
}
