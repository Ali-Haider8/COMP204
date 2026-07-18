package L2.HW.BankApplication;

/*
Source:  docs/lectures/Lecture2.pdf (page 2 of 3)
Created by ali_h on 7/17/2026 at 09:21
*/

import java.util.Scanner;

public class Bank2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome!");

        BankAccount2 bankAccount = new BankAccount2();
        System.out.print("\nPlease enter your account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("\nEnter your PIN: ");
        int enteredPIN = sc.nextInt();
        sc.close();
        if (bankAccount.isValidPin(enteredPIN)) {
            showMenu();
        }
    }

    static void showMenu(){
        System.out.println("\nMain menu: ");
        System.out.println("1- View my balance");
        System.out.println("2- Withdraw cash");
        System.out.println("3- Deposit funds");
        System.out.println("4- Exit");
        System.out.print("\nEnter a choice: ");
    }
}
