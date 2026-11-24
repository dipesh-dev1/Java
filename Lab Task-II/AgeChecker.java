class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted for age: " + age);
        }
    }
    public static void main(String[] args) {
        int[] testAges = {15, 18, 22, 12};

        for (int age : testAges) {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Error for age " + age + ": " + e.getMessage());
            }
        }
    }
}