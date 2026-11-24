import java.util.Scanner;
public class Circle {
    double area;
    void arc(int r){
        final double pi=3.14;
        double area = pi*r*r;
        System.out.println("Area of circle : "+area);
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of radius");
        int r=sc.nextInt();
        c.arc(r);
        sc.close();
    }
}