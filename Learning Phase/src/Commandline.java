import java.util.Scanner;
public class Commandline{
    public static void main(String[] args) {
        System.out.println("Using command line arguments:");
        for(String arg:args){
            System.out.println(arg);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        System.out.println("Hello My name is "+name  + "I am "+ age +" years old.");
        sc.close();
    }
}