package L2.HW.BankApplication;

/*
Source:  docs/lectures/Lecture2.pdf (page 2 of 3)
Created by ali_h on 7/17/2026 at 07:35
*/

public class BankAccount2 {

    private static int pin = 54321;

     public boolean isValidPin(int num) {
        return num == pin;
    }
}
