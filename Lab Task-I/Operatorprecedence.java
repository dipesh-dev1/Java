public class Operatorprecedence {
        public static void main(String[] args) {
        int result = 5 + 3 * 2 / (5 - 2) % 4;
        // Operator precedence:
        // 1. Parentheses: (5 - 2) = 3
        // 2. Multiplication: 3 * 2 = 6
        // 3. Division: 6 / 3 = 2
        // 4. Modulus: 2 % 4 = 2
        // 5. Addition: 5 + 2 = 7

        System.out.println(result);
    }
}