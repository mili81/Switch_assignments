package com.company;
import java.util.Scanner;
public class Mathematics {
    public static void main(String[]args){
        System.out.println("Please enter the first number");
        Scanner var1 = new Scanner(System.in);
        int A = var1.nextInt();

        System.out.println("Please enter the second number");
        Scanner var2 = new Scanner(System.in);
        int B = var2.nextInt();

        System.out.println("Please enter the operation method by Your choice:\n"+
                "+ , - , / , * , % ,'p' for print, 'b' for bigger, 's' for smaller;");
        Scanner input = new Scanner(System.in);
        char operation = input.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println("The sum of both numbers is" + (A+B));
                break;
            case '-':
                System.out.println("The subtraction of both numbers is " + (A-B));
                break;
            case '/':
                System.out.println("The result of dividing  of both numbers is " + (A/B));
                break;
            case '*':
                System.out.println("The result of multiplication is " + (A * B));
                break;
            case '%':
                System.out.println("The remainder when the first number divided by the second number is \n " +
                        (A % B));
                break;
            case 'p':
                System.out.println("You have entered the numbers: " + A + " and " + B);
                break;
            case 'b':
                if( A > B) {
                    System.out.println(A + " is bigger than " + B);
                }else{
                    System.out.println( B + " is bigger than " + A);
                }
                break;
            case 's':
                if (A < B) {
                    System.out.println(A + " is smaller than " + B);
                }else{
                    System.out.println(B + " is smaller than " + A);
                }
                break;
        }

    }
}
