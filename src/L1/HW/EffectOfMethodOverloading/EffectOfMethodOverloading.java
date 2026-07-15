package L1.HW.EffectOfMethodOverloading;

/*
Q> Using programming show the effect of the method overloading.

Source: docs/lectures/Lecture1.pdf (page 3 of 3)
Created by ali_h on 7/11/2026 at 11:58 PM
*/

/*
Overloading is writing the same method in same class but with different parameters
to make a method overloading or make Method Signature Resolution
1. number of parameters should be different
2. data type of parameters should be different
3. sequence of parameters should be different

* different in function return type don't make overloading method

why method overloading
1- readability: instead of write addInt() and andDouble() we write just add()
2- flexibility: you can pass different types of parameters to same function name
*/

public class EffectOfMethodOverloading {


    static float add(int a, int b) {
        return a + b;
    }

    static float add(int a, float b) {
        return a + b;
    }

    static float add(float a, int b) {
        return a + b;
    }

    static float add(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 10));
        System.out.println(add(10, 10.5f));
        System.out.println(add(10.5f, 10));
        System.out.println(add(10.5f, 10, 10));
    }
}
