public class Car {
    void setYear(String make, int year){
        System.out.println(make+"  "+year);
    }
    void setYear(String make){
        System.out.println(make);
    }
    public static void main(String[] args) {
        Car cc=new Car();
        cc.setYear("Porche");
        cc.setYear("Fortuner", 2005);
    }
}