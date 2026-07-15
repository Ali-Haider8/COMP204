package L1.HW.ArrayOfObjects;

/*
Q> Convert an object into an array of object.

Source: docs/lectures/Lecture1.pdf (page 3 of 3)
Created by ali_h on 7/15/2026 at 18:03
*/

import java.util.Scanner;

public class StudentsBook {

    public static void main(String[] args) {

        // object
        Student s1 = new Student();
        s1.name = "Ali";
        System.out.println(s1.name);

        // array of objects
        Student[] students = new Student[3]; // deceleration

        // initialization
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name ");
        for (Student student : students) {
            student.name = sc.nextLine();
        }
        sc.close();

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
