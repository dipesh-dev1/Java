public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // outer loop

            for (int j = 1; j <= 10; j++) { // inner loop
                int product = i * j;
                if (product > 50) {
                    break; // exit inner loop if product exceeds 50

                }
                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println(); 
        }
    }
}