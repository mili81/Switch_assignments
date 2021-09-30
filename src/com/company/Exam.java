package com.company;
import java.util.Scanner;
public class Exam {
    public static void main (String [] args){
        System.out.println("Please, enter Your grade level: ");
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Such grade does not exist! Try again!");

        }
    }

}
