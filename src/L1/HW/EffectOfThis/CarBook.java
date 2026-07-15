package L1.HW.EffectOfThis;

/*
Q> Using programming show the effect of the keyword this.

Source: docs/lectures/Lecture1.pdf (page 3 of 3)
Created by ali_h on 7/9/2026 at 3:26 AM
*/

public class CarBook {

    public static void main(String[] args) {

        String initCarName = "kia";
        Car car1 = new Car(initCarName); // we initialized the carName using constructor
        System.out.println("Car name is: " + car1.getCarName());
        car1.setCarName("Honda");
        System.out.println("Car name is: " + car1.getCarName());

    }
}
