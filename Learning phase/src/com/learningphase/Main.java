package com.learningphase;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Comments :-
//My first code [single line comment]
/*              [multi line comment]
* here is a comment
* hello my name is Dipesh Chaudhary.
 */
        System.out.print("Hello Java \n");
        //Variables
        String neighbour = "Alu";
        String friend = neighbour;

        /* Primitive Data Types :-
        * byte - 1[-128 to 127]
        * short - 2
        * int - 4
        * long - 8
        * float - 4 e.g 3.14
        * double - 8
        * char - 2 a,b,c,d
        * boolean - 1 true/false
         */
        byte age = 30;
        int phone = 1234567890;
        long phone2 = 1234567890000L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        //Non-primitive Data Types :-
        String name = new String("Dipesh");
        String show = new String("Dona");


        //String operations :-[ strings  are immutable. ]
        //concatenate -It means adding to strings.
        String name1 = "Dipesh";
        String name2 = "Alu";
        String name3 = name1 + " and " + name2;
        System.out.println("Concatenate result : " + name3);

        /*charAt -It is a function which shows character present at which position.
        * In java index always starts from 0(Zero).
         */
        String hey = "Dipesh";
        System.out.println("N'th position word : " + hey.charAt(1));

        //length -To calculate the length of string.
        System.out.println("Length of string : " + name.length());

        /* replace -To replace one character to new another character.
        * But we can't change original String value once we create it.
        * It must be stored into new variable.
         */
        String name4 = name.replace('i','u');
        System.out.println("Word replaced new name is : " + name4);
        System.out.println("Original name : " + name);

        //substring -To take one specific part of string.But one value must be added extra to print total string.
        String nam = "Dipesh and Dupesh";
        System.out.println("SubString result : " + nam.substring(6,10));


        //Arrays -List of similar data types.
         int physics = 97;
         int chem = 98;
         int eng = 95;
         int[] marks = new int[3];
         marks[0] = 97;
         marks[1] = 98;
         marks[2] = 95;
        System.out.println("1D array : " + marks[0]);

        //length of array
        System.out.println("Length of array list : " + marks.length);

        //sort -It takes values in ascending order.
        Arrays.sort(marks);
        System.out.println("Array value in ascending order : " + marks[0]);

        //If array values are known
        int[] number = {98, 45, 67};
        Arrays.sort(number);
        System.out.println("1D array if values are known : " + number[0]);

        //2D Array i.e 2 Dimensional array
        int[][] finalMarks = {{97, 98, 95}, {90, 40, 34}};
        System.out.println("2D array if values are known : " + finalMarks[1][1]);


        /* Casting -Change one data type into another.
        * Types :- 1. Implicit Casting (Automatic, small data type to big data type)
        *          2. Explicit Casting (user defined user ley manually garne )
        */
        double price = 100.00;
        double finalPrice = price + 13; //Implicit casting
        System.out.println("Implicit type casting : " + finalPrice);

        int p = 100;
        int fp = p + (int)13.99; //Explicit casting
        System.out.println("Explicit type casting : " + fp);


//        double c=200.99;
//        int b=(int)c;
//        System.out.println(b);


        //Constants -Define with final keyword and can't change once value is assigned.
       final float PI = 3.14F;


       /* Operators -
       Types :- 1) Arithmetic +, -, *, /, % (Modulo holds carry)
                2) Assignment =
                3) Logical   * && - Both condition must be true
                             * || - Works on any one condition true
                4) Comparison  * a == b
                               * a != b
                               * a < b
                               * a > b
                               * a <= b
                               * a >= b
                5) Unary (++, --)
       */
      double a = 5;
      double b = 3;
      double modulo = a%b;
        System.out.println("Modulo value : " + modulo);

      //Unary Operator
        int numb = 1;
        System.out.println("Post increment : " + numb++); //1
        System.out.println("Pre increment : " + ++numb); //3
        System.out.println("Result of increment : " + numb); //3
        System.out.println("Pre decrement : " + --numb); //2
        System.out.println("Post decrement : " + numb--); //2
        System.out.println("Result of decrement : " + numb); //1


        //Math class
        System.out.println("Max value is : " + Math.max(4,10));
        System.out.println("Min value is : : " + Math.min(2,7));


        //random function -It returns number from 0.0 to 1.0
        System.out.println("Random value : " + (int)(Math.random()*100));

        //How to take INPUT,?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Name : ");
//        String name5 = sc.nextLine();
//        System.out.println(name5);


        //Conditional Statement ( if else )
        boolean isSunUp = false;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        int umer = 1;
        if(umer>18)
            System.out.println("Can vote");
        else
            System.out.println("Can't vote");


        //Logical Operators
        // && - Both condition must be true
        int c = 20;
        int d = 49;
        if(c < 50 && d < 50)
            System.out.println("Both less than 50");

        // ||
        if(c < 50 || b < 50)
            System.out.println("At least one less than 50");

        // !
        boolean isYoung = true;
        if(!isYoung)
            System.out.println("Is Young");
        else
            System.out.println("Not Young");

        //Exmple  for Conditional Statement
        Scanner sc = new Scanner(System.in);
        //pen = 10, notebook = 40

        int cash = sc.nextInt();
        if(cash < 10) {
            System.out.println("Can't buy anything");
            System.out.println("Get more cash");
        }
        else if (cash > 10 && cash <50) {
            System.out.println("Can get 1 thing");
        }
        else {
            System.out.println("Can get both");
        }
    }
    }
