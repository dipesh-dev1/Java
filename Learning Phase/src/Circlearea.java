import java.util.Scanner;
public class Circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI=3.14;
        System.out.println("Enter value of radius :");
        double radius=sc.nextDouble();
        double area = PI*radius*radius;
        System.out.println("Area of the circle :"+area);
        sc.close();
    }
}
