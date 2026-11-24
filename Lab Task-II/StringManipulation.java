import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String modified = input.toUpperCase().replace('A', '@');
        System.out.println("Modified string: " + modified);
        sc.close();
    }
}