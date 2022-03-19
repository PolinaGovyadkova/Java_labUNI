package com.company;

public class Main {

    public static void main(String[] args) {
        Parking parking = new Parking(15);
        Car car = new Car("Toyota");
        Car car1 = new Car("Ford");
        Car car2 = new Car("A");
        System.out.println(parking.AddCar(car, 10));
        System.out.println(parking.AddCar(car1, 11));
        System.out.println(parking.AddCar(car2, 12));
        System.out.println(parking.toString());
        System.out.println(parking.RemoveCar(car1));
        System.out.println(parking.toString());
    }
}
