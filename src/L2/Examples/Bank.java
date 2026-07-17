package L2.Examples;

/*
Source:  docs/lectures/Lecture2.pdf (page 1 of 3)
Created by ali_h on 7/15/2026 at 18:45
*/

public class Bank {

    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
//        customer.balance = 100000;
        customer.setBalance(100000);
        System.out.println("Balance Information: " + customer.getBalance());
    }
}
