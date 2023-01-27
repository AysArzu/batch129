package day25inhetirance;


public class Car extends Vehicle {
public int price=11000;
    public Car() {

        System.out.println("Car 1");
    }

    public Car(String make) {

        System.out.println("Car 2: " + make);
    }
}