class Vehicle {
    void start(){
        System.out.println("Vehicle starts");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts");
    }
}
public class Lab21{
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.start();
    }
}
