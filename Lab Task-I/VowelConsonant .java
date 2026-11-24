import java.util.Scanner;
class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);   // Read the first char of the input

        ch = Character.toLowerCase(ch);  // Normalize to lowercase

        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single letter.");
        }
        sc.close();
    }
}