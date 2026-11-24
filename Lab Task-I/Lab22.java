abstract class Shape {
    abstract void draw(); 
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Lab22 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw(); 
    }
}