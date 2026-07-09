package L1.HW.ONE;

/*
Q> Using programming show the effect of the keyword this.

Source: docs/lectures/Lecture1.pdf (page 3 of 3)
Created by ali_h on 7/9/2026 at 3:22 AM
*/

public class Car {

    private String carName;

    public void setCarName(String name) {
        carName = name;
    }

    public String getCarName() {
        return carName;
    }

    // by using Constructor we can set initial value for carName
    // when creating an object of Car class.
    public Car(String name) {
        this.carName = name;
    }


}
