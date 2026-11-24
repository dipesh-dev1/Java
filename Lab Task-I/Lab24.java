interface Moveable {
    void move(); 
}

class Car implements Moveable {
    public void move() {
        System.out.println("Car is moving");
    }
}

public class Lab24 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}