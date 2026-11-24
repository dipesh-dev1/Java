class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    final void type() {
        System.out.println("vehicle Type: Car");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.type(); 
    }
}