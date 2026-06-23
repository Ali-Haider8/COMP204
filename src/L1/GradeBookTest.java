package L1;


// Fig. 3.8: GradeBookTest.java
// Creating and manipulating a GradeBook object.

import java.util.Scanner; // program uses Scanner

/*
Source: Lecture1.pdf (page 2 of 3)
Created by ali_h on 6/23/2026 at 11:49 PM
*/

public class GradeBookTest {

    // main method begins program execution
    public static void main(String[] args) {

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();

        // display initial value of courseName
        System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());

        // prompt for and read course name
        System.out.println("Please enter the course name: ");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
        System.out.println(); // outputs a blank line

        // display welcome message after specifying course name
        myGradeBook.displayMessage();
    } // end main
} // end class GradeBookTest
