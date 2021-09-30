package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number of week day");
        Scanner input = new Scanner(System.in);
        int dayNo = input.nextInt();
        switch (dayNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Today is working day");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;
            default:
                System.out.println("Please choose an accurate week day number!");
                break;

        }
    }
}

