public class WrapperExample {
    public static void main(String[] args) {
        String intStr = "100";
        String doubleStr = "99.99";
        char ch = 'A';

        int num = Integer.parseInt(intStr);
        double price = Double.parseDouble(doubleStr);

        boolean isLetter = Character.isLetter(ch);
        boolean isDigit = Character.isDigit(ch);

        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Is '" + ch + "' a letter? " + isLetter);
        System.out.println("Is '" + ch + "' a digit? " + isDigit);
    }
}
