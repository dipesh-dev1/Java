public class Lab1 {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = divide(10, 0); 
        System.out.println("Result: " + result);
    }
}