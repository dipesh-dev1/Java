import java.util.Scanner;
public class Arithmeticop {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = s.nextInt();
        System.out.print("Enter second integer: ");
        int b = s.nextInt();
        
        int c=a+b;
       System.out.println("Addition: " + c);

        c = a - b;
        System.out.println("Subtraction: " + c);

        c = a * b;
        System.out.println("Multiplication: " + c);

        c = a / b;
        System.out.println("Division: " + c);

        c = a % b;
        System.out.println("Modulus: " + c);
        s.close();
    }
}