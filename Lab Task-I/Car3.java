// Using constructor accessing constructor method

public class Car3 {
    string make;
    int year;
    Car3(String make, int year){
       this.make=make;
       this.year=year;
    }
    void show(){
        System.out.println("The car made by "+make+"Made in"+year);
    }
    public static void main(String[] args) {
        Car3 cc=new Car3("Supra",1900);
        cc.show();
    }
}