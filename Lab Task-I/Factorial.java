import java.math.BigInteger;
public class Factorial{
    public static void main(String[] args) {
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= 20; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of 20 is: " + fact);
    }
}