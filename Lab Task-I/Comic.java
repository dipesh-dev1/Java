// (Lab-20) Multi-Level Inheritance:SUV

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}

class SUV extends Car {
    void start() {
        System.out.println("SUV starts");
    }
}

public class Comic {
    public static void main(String[] args) {
        SUV mySUV = new SUV();
        mySUV.start();  
    }
}