public class MathOperations {
    public static void main(String[] args) {
        double number = 25;

        // 1. Square root
        double sqrt = Math.sqrt(number);

        // 2. Random number between 1 and 100
        int random = (int)(Math.random() * 100) + 1;

        // 3. Max and Min between two numbers
        int a = 45, b = 78;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println("Square root of " + number + ": " + sqrt);
        System.out.println("Random number (1-100): " + random);
        System.out.println("Max of " + a + " and " + b + ": " + max);
        System.out.println("Min of " + a + " and " + b + ": " + min);
    }
}