import java.util.Scanner;
public class Intro {
    void cmd(String a, int b){
        System.out.println("Hello how are you ?");
        System.out.println("My name is "   +a);
        System.out.println("I am " +b+ " years old.");
    }
    public static void main(String[] args) {
        Intro ii=new Intro();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String a=sc.nextLine();
        System.out.println("Enter your age");
        int b=sc.nextInt();
        ii.cmd(a,b);
        sc.close();
    }
}
